package com.example.filmcatalogappwithretrofitmoshi.domain.use_case

import com.example.filmcatalogappwithretrofitmoshi.data.dto.MoviDataDto
import com.example.filmcatalogappwithretrofitmoshi.domain.repository.RemoteDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetMovieDataUseCase @Inject constructor(
    private val repository: RemoteDataRepository
) {
    suspend operator fun invoke(title: String): Flow<MoviDataDto> = flow {
        emit(repository.getMovieData(title))
    }
}