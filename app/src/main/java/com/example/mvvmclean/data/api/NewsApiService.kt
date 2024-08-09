package com.example.mvvmclean.data.api

import androidx.core.os.BuildCompat
import com.example.mvvmclean.data.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApiService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String ="b3f46ffb865b4429b908159b50b3cb78"
    ): Response<ApiResponse>
}