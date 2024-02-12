package com.example.filmcatalogappwithretrofitmoshi.domain.use_case

import com.example.filmcatalogappwithretrofitmoshi.data.dto.SearchResultDto
import com.example.filmcatalogappwithretrofitmoshi.domain.model.SearchResult
import com.example.filmcatalogappwithretrofitmoshi.domain.repository.RemoteDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetSearchResultUseCase @Inject constructor(
    private val repository: RemoteDataRepository
) {
    suspend operator fun invoke(search: String): Flow<SearchResultDto> = flow {
        emit(repository.getSearchResult(search))
    }
}