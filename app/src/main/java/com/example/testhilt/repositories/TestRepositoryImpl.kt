package com.example.testhilt.repositories

import com.example.testhilt.dao.TestDao
import com.example.testhilt.models.TestDB
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val testDao: TestDao
) : TestRepository {
    override fun getFakeText() = "fakeText"

    override fun setDb() {
        testDao.insertPrinters(listOf(TestDB("fakeText")))
    }

    override fun getDb(): String {
        return testDao.getPrinters().first().text
    }
}