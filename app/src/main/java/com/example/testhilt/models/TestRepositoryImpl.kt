package com.example.testhilt.models

import android.content.Context
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(private val context: Context) : TestRepository{
    override fun getFakeText() = "fakeText"
}