package com.example.testhilt.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.testhilt.dao.TestDatabase
import com.example.testhilt.models.TestDB
import com.example.testhilt.repositories.TestRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@Suppress("unused")
@InstallIn(SingletonComponent::class)
class ProvideModule {
    @Provides
    @Singleton
    fun provideDatabase(app: Application): TestDatabase =
        Room.databaseBuilder(
            app,
            TestDatabase::class.java,
            "test_database"
        ).fallbackToDestructiveMigration().build()

    @Singleton
    @Provides
    fun providePrintersDao(db: TestDatabase) = db.printersDao()

}
