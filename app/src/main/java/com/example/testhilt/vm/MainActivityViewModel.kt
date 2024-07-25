package com.example.testhilt.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testhilt.repositories.TestRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val testRepository: TestRepository) : ViewModel() {

    private val _text = MutableStateFlow("Hello, World!")
    val text: StateFlow<String> = _text

    fun getFakeText() {
        viewModelScope.launch(Dispatchers.IO) {
            _text.update { testRepository.getDb() }
        }
    }

    fun createFakeData() {
        viewModelScope.launch(Dispatchers.IO) {
            testRepository.setDb()
        }
    }
}