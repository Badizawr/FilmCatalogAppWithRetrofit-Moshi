package com.example.filmcatalogappwithretrofitmoshi.domain.model

import com.example.filmcatalogappwithretrofitmoshi.data.dto.Search
import com.squareup.moshi.Json

data class SearchResult(
    val search: List<Search>
)
