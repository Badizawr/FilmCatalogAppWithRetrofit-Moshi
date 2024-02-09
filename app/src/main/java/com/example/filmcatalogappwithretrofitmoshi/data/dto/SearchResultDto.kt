package com.example.filmcatalogappwithretrofitmoshi.data.dto


import com.example.filmcatalogappwithretrofitmoshi.domain.model.SearchResult
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchResultDto(
    @Json(name = "Search")
    val search: List<Search>,
    @Json(name = "totalResults")
    val totalResults: String,
    @Json(name = "Response")
    val response: String
)

fun SearchResultDto.toSearchResult(): SearchResult {
    return SearchResult(search = search)
}