package com.example.mvi_app.data.api

import com.example.mvi_app.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}