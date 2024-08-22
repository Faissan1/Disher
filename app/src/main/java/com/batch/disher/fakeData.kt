package com.batch.disher

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.batch.disher.Category.viewmodel.CategoryViewModel


@Composable
fun fakeData(
    hilt: CategoryViewModel=hiltViewModel()
){
    val  data= listOf("a","b" ,"c","a","b" ,"c","a","b" ,"c")
    Column {
        data.forEach {
            Text(text = it)
        }
    }
}