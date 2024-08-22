package com.batch.disher.Category.viewmodel

import androidx.lifecycle.ViewModel
import com.batch.disher.Category.usecase.Usecase
import com.batch.disher.Category.usecase.UsecaseImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(usecase: Usecase):ViewModel() {
    init {
        usecase
    }
}