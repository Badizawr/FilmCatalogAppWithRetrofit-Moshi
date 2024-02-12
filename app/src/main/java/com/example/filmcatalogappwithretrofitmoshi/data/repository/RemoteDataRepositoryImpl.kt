package com.example.filmcatalogappwithretrofitmoshi.data.repository

import com.example.filmcatalogappwithretrofitmoshi.data.MovieAPI
import com.example.filmcatalogappwithretrofitmoshi.data.dto.MoviDataDto
import com.example.filmcatalogappwithretrofitmoshi.data.dto.SearchResultDto
import com.example.filmcatalogappwithretrofitmoshi.domain.repository.RemoteDataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RemoteDataRepositoryImpl @Inject constructor(
    private val api: MovieAPI
) : RemoteDataRepository {
    override suspend fun getMovieData(title: String): MoviDataDto {
        return withContext(Dispatchers.Default) {
            api.getMovieData(title = title)
        }
    }

    override suspend fun getSearchResult(search: String): SearchResultDto {
        return withContext(Dispatchers.Default) {
            api.getSearchResult(search = search)
        }
    }
}