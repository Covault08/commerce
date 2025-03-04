package com.example.commerce.di

import com.example.commerce.data.repository.ItemRepository
import com.example.commerce.data.repository.ItemRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsRepository(
        newsRepositoryImpl: ItemRepositoryImpl
    ): ItemRepository
}