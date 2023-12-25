package com.febro.daggerhiltcourse.data.repository

import android.app.Application
import com.febro.daggerhiltcourse.R
import com.febro.daggerhiltcourse.data.remote.MyApi
import com.febro.daggerhiltcourse.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(private val api: MyApi, private val appContext: Application) :
    MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}