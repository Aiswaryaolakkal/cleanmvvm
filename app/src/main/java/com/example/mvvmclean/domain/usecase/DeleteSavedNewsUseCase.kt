package com.example.mvvmclean.domain.usecase

import com.example.mvvmclean.data.model.Article
import com.example.mvvmclean.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val repository:NewsRepository) {
     suspend fun execute(article: Article)= repository.deleteNews(article)
}