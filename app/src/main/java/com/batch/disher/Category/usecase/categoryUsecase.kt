package com.batch.disher.Category.usecase

import com.batch.disher.Category.repository.Repository
import com.batch.disher.Category.repository.RepositoryImpl
import javax.inject.Inject

interface Usecase{
    operator fun invoke():String
}

class UsecaseImpl  @Inject constructor(val repo: Repository) :Usecase{
        override fun invoke(): String {
        return repo.getCategoryRepository()
    }
}