package com.example.filmcatalogappwithretrofitmoshi.data

import com.example.filmcatalogappwithretrofitmoshi.data.dto.MoviDataDto
import com.example.filmcatalogappwithretrofitmoshi.data.dto.SearchResultDto
import com.example.filmcatalogappwithretrofitmoshi.util.Constants
import retrofit2.http.GET
import retrofit2.http.OPTIONS
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface MovieAPI {
    @GET("/")
    suspend fun getMovieData(
        @Query("apikey") apiKey: String = Constants.API_KEY,
        @QueryMap options: Map<String, String> = mapOf("plot" to "full", "type" to "movie"),
        @Query("t") title: String
    ): MoviDataDto

    @GET("/")
    suspend fun getSearchResult(
        @Query("apikey") apiKey: String = Constants.API_KEY,
        @Query("type") type: String = "movie",
        @Query("s") search: String
    ): SearchResultDto
}