package com.example.testhilt.vm

import androidx.lifecycle.ViewModel
import com.example.testhilt.models.TestRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val testRepository: TestRepository): ViewModel() {
    fun getFakeText() = testRepository.getFakeText()
}