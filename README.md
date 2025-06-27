# My E-Commerce App

An Android-based e-commerce application built using Jetpack Compose and Retrofit to provide users with seamless product browsing and details experience.

---

## Features

- **Product Details Screen**: Display detailed information about products, including images, colors, and pricing.
- **Dynamic Image Viewer**: Swipe through multiple product images with interactive indicators.
- **Color Selection**: Dynamically switch between product colors and view corresponding images.
- **Favorite & Share Actions**: Mark products as favorite or share them with others.
- **Clean UI**: Responsive and visually appealing design using Jetpack Compose.

---

## Technologies Used

- **Jetpack Compose**: For modern, declarative UI design.
- **Retrofit**: For API communication and data fetching.
- **Kotlin Coroutines**: For asynchronous operations.
- **ViewModel & StateFlow**: For state management and lifecycle-aware components.
- **Coil**: For efficient image loading.

---

## File Structure

- **ApiServices.kt**: Contains the API interface for fetching product details using Retrofit.
- **MainActivity.kt**: The entry point of the app, hosting the `ProductDetailScreen`.
- **NetworkModule.kt**: Provides a singleton instance of the Retrofit service.
- **ProductDetailScreen.kt**: Implements the UI for displaying product details.
- **ProductRepository.kt**: Manages API interactions and provides product data.
- **ProductResponse.kt**: Data models for parsing API responses.
- **ProductViewModel.kt**: Handles state management and business logic for product details.

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Omkarjaiswal414/EcommerceApp.git
