package com.febro.daggerhiltcourse.data.di

import android.app.Application
import com.febro.daggerhiltcourse.data.remote.MyApi
import com.febro.daggerhiltcourse.data.repository.MyRepositoryImpl
import com.febro.daggerhiltcourse.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // defines how long the componet will live
object AppModule {
    // these functions are only called by dagger hilt behind the scenes

    @Provides // Annotates methods of a module to create a provider method binding. The method's return type is bound to its returned value. The component implementation will pass dependencies to the method as parameters.
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun provideMyRepository(
//        api: MyApi,
//        app: Application,
//        @Named("hello1") hello1: String
//    ): MyRepository {
//        return MyRepositoryImpl(api, app)
//    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
 }