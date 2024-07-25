package com.example.testhilt.repositories

import com.example.testhilt.dao.TestDao
import com.example.testhilt.models.TestDB
import javax.inject.Inject

interface TestRepository {
    fun getFakeText(): String
    fun setDb()
    fun getDb(): String
}