package com.batch.disher.di

import com.batch.disher.Category.repository.Repository
import com.batch.disher.Category.repository.RepositoryImpl
import com.batch.disher.Category.usecase.Usecase
import com.batch.disher.Category.usecase.UsecaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Appmodule {

    @Provides
    @Singleton
    suspend fun RetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Binds
    @Singleton
    suspend fun ICategoryServiceImpl(retrofit: Retrofit):ICategoryService{
        return retrofit.create(ICategoryService::class.java)
    }

    @Module
    @InstallIn(SingletonComponent::class)
    interface modules{

        @Binds
        @Singleton
        fun providesUsecaseD(uc:UsecaseImpl):Usecase

        @Binds
        @Singleton
        fun providesRepositoryD(repo:RepositoryImpl):Repository
    }
}