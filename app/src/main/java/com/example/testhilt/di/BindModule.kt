package com.example.testhilt.di

import com.example.testhilt.models.TestRepository
import com.example.testhilt.models.TestRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
@Suppress("unused")
abstract class BindModule {
    @Binds
    abstract fun bindRepository(impl: TestRepositoryImpl): TestRepository
}
