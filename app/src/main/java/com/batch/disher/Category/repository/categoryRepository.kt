package com.batch.disher.Category.repository

import com.batch.disher.fakeData
import javax.inject.Inject

interface Repository{
    fun getCategoryRepository():String
}

class RepositoryImpl @Inject constructor():Repository{
    override fun getCategoryRepository():String{
        return ""
    }

}