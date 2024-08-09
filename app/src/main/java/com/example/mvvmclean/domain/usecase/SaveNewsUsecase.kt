package com.example.mvvmclean.domain.usecase

import com.example.mvvmclean.data.model.Article
import com.example.mvvmclean.domain.repository.NewsRepository


class SaveNewsUsecase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.saveNews(article)
}