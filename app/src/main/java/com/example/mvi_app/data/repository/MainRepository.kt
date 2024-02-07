package com.example.mvi_app.data.repository

import com.example.mvi_app.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}