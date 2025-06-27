package com.example.myecommerceapp

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("rest/V1/productdetails/6701/253620")
    suspend fun getProductDetails(
        @Query("lang") lang: String = "en",
        @Query("store") store: String = "KWD"
    ): ProductResponse
}