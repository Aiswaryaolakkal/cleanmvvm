package com.example.mvvmclean.domain.usecase

import com.example.mvvmclean.data.model.Article
import com.example.mvvmclean.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUsecase(private val newsRepositoty:NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepositoty.getSavedNews()
    }
}





