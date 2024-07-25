package com.example.testhilt.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testhilt.models.TestDB

@Database(entities = [TestDB::class], version = 3)
abstract class TestDatabase : RoomDatabase() {

    abstract fun printersDao(): TestDao
}