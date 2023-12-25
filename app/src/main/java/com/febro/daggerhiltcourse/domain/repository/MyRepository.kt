package com.febro.daggerhiltcourse.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}