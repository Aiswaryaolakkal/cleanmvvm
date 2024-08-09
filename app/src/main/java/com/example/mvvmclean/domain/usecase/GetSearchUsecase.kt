package com.example.mvvmclean.domain.usecase

import androidx.appcompat.resources.Compatibility.Api15Impl
import com.example.mvvmclean.data.model.ApiResponse
import com.example.mvvmclean.domain.repository.NewsRepository
import com.example.mvvmclean.utils.Resource

class GetSearchUsecase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery:String): Resource<ApiResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}