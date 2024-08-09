package com.example.mvvmclean.domain.responsImpl

import com.example.mvvmclean.data.api.NewsApiService
import com.example.mvvmclean.data.model.ApiResponse
import com.example.mvvmclean.data.model.Article
import com.example.mvvmclean.domain.repository.NewsRepository
import com.example.mvvmclean.utils.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepornseImpl(
    private val newsRemoteDataSource: NewsApiService
) : NewsRepository {
    private fun responseToResource(response: Response<ApiResponse>): Resource<ApiResponse> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getNewsHeadlines(): Resource<ApiResponse> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines("", 3, ""))
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<ApiResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}