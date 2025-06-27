package com.example.myecommerceapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class ProductUiState(
    val isLoading: Boolean = false,
    val product: ProductData? = null,
    val selectedColorIndex: Int = 0,
    val selectedImageIndex: Int = 0,
    val error: String? = null
)

class ProductViewModel : ViewModel() {
    private val repository = ProductRepository()

    private val _uiState = MutableStateFlow(ProductUiState())
    val uiState: StateFlow<ProductUiState> = _uiState

    init {
        loadProduct()
    }

    private fun loadProduct() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            repository.getProductDetails()
                .onSuccess { product ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        product = product,
                        error = null
                    )
                }
                .onFailure { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message,
                        product = null
                    )
                }
        }
    }

    fun selectColor(index: Int) {
        _uiState.value = _uiState.value.copy(
            selectedColorIndex = index,
            selectedImageIndex = 0
        )
    }

    fun selectImage(index: Int) {
        _uiState.value = _uiState.value.copy(selectedImageIndex = index)
    }
}
