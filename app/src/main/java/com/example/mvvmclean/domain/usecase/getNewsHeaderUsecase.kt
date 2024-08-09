package com.example.mvvmclean.domain.usecase

import com.example.mvvmclean.data.model.ApiResponse
import com.example.mvvmclean.domain.repository.NewsRepository
import com.example.mvvmclean.utils.Resource

class getNewsHeaderUsecase(private  val repository: NewsRepository) {
    suspend fun execute(): Resource<ApiResponse> {
        return  repository.getNewsHeadlines()
    }
}