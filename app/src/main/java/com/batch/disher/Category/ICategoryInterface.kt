package com.batch.disher.Category

import retrofit2.Response
import retrofit2.http.GET

public interface ICategoryInterface {

    @GET("categories.php")
    suspend fun getCategories() :Response<Category>

}

//https://www.themealdb.com/api/json/v1/1/categories.php