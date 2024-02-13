package com.example.filmcatalogappwithretrofitmoshi.di

import android.provider.SyncStateContract.Constants
import com.example.filmcatalogappwithretrofitmoshi.data.MovieAPI
import com.example.filmcatalogappwithretrofitmoshi.data.repository.RemoteDataRepositoryImpl
import com.example.filmcatalogappwithretrofitmoshi.domain.repository.RemoteDataRepository
import com.example.filmcatalogappwithretrofitmoshi.domain.use_case.GetMovieDataUseCase
import com.example.filmcatalogappwithretrofitmoshi.domain.use_case.GetSearchResultUseCase
import com.example.filmcatalogappwithretrofitmoshi.domain.use_case.UseCases
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @Provides
    @Singleton
    fun provideMovieApi(moshi: Moshi): MovieAPI {
        return Retrofit.Builder()
            .baseUrl(com.example.filmcatalogappwithretrofitmoshi.util.Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(MovieAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: MovieAPI): RemoteDataRepository {
        return RemoteDataRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideUserCase(repository: RemoteDataRepository): UseCases {
        return UseCases(
            getMovieDataUseCse = GetMovieDataUseCase(repository),
            getSearchResultUseCase = GetSearchResultUseCase(repository)
        )
    }
}