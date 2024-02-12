package com.example.filmcatalogappwithretrofitmoshi.domain.repository

import com.example.filmcatalogappwithretrofitmoshi.data.dto.MoviDataDto
import com.example.filmcatalogappwithretrofitmoshi.data.dto.SearchResultDto

interface RemoteDataRepository {
    suspend fun getMovieData(title: String): MoviDataDto
    suspend fun getSearchResult(search: String): SearchResultDto
}