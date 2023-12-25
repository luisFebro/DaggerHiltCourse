package com.febro.daggerhiltcourse

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.febro.daggerhiltcourse.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import javax.inject.Inject


// field injection example - https://youtu.be/bbMsuI2p1DQ?t=1811s

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()

        runBlocking {
            repository.doNetworkCall()
        }
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}