package com.example.myecommerceapp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository {
    private val apiService = NetworkModule.apiService

    suspend fun getProductDetails(): Result<ProductData> {
        return withContext(Dispatchers.IO) {
            try {
                val response = apiService.getProductDetails()
                if (response.status == 200) {
                    Result.success(response.data)
                } else {
                    Result.failure(Exception(response.message))
                }
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
}