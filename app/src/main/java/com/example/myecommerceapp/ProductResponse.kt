package com.example.myecommerceapp

data class ProductResponse(
    val status: Int,
    val message: String,
    val data: ProductData
)


data class ProductData(
    val id: String,
    val sku: String,
    val name: String,
    val price: String,
    val final_price: String,
    val brand_name: String,
    val image: String,
    val description: String,
    val configurable_option: List<ConfigurableOption>,
    val images: List<String>
)

data class ConfigurableOption(
    val attribute_id: Int,
    val type: String,
    val attribute_code: String,
    val attributes: List<ColorAttribute>
)

data class ColorAttribute(
    val value: String,
    val option_id: String,
    val price: String,
    val images: List<String>,
    val swatch_url: String
)