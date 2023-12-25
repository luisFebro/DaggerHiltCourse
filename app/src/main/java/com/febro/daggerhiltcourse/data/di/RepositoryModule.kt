package com.febro.daggerhiltcourse.data.di

import com.febro.daggerhiltcourse.data.repository.MyRepositoryImpl
import com.febro.daggerhiltcourse.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    // preferable way to inject interfaces than equivalant provides - less code
    // ref: https://youtu.be/bbMsuI2p1DQ?t=1695s
    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}


// BEFORE:
//    @Provides
//    @Singleton
//    fun provideMyRepository(
//        api: MyApi,
//        app: Application,
//        @Named("hello1") hello1: String
//    ): MyRepository {
//        return MyRepositoryImpl(api, app)
//    }