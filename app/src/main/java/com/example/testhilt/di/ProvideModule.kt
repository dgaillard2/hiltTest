package com.example.testhilt.di

import android.content.Context
import com.example.testhilt.models.TestRepositoryImpl
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
    fun provideRepository(@ApplicationContext appContext: Context) =
        TestRepositoryImpl(appContext)
}