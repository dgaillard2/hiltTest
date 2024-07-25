package com.example.testhilt.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.testhilt.models.TestDB


@Dao
interface TestDao {

    @Query("SELECT * FROM tests")
    fun getPrinters(): List<TestDB>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPrinters(printer: List<TestDB>)

    @Query("DELETE FROM tests")
    fun deleteAllPrinters()
}