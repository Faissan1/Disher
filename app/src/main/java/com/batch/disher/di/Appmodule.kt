package com.batch.disher.di

import com.batch.disher.Category.repository.Repository
import com.batch.disher.Category.repository.RepositoryImpl
import com.batch.disher.Category.usecase.Usecase
import com.batch.disher.Category.usecase.UsecaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Appmodule {

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