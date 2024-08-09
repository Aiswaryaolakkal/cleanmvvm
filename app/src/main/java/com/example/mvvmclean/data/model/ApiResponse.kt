package com.example.mvvmclean.data.model

data class ApiResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)