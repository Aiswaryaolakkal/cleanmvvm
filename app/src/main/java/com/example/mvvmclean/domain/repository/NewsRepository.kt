package com.example.mvvmclean.domain.repository

import com.example.mvvmclean.data.model.ApiResponse
import com.example.mvvmclean.data.model.Article
import com.example.mvvmclean.utils.Resource
import kotlinx.coroutines.flow.Flow

interface  NewsRepository {
    suspend fun getNewsHeadlines(): Resource<ApiResponse>
    suspend fun getSearchedNews(searchQuery:String) : Resource<ApiResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}