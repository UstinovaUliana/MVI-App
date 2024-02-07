package com.example.mvi_app.data.api

import com.example.mvi_app.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>
}