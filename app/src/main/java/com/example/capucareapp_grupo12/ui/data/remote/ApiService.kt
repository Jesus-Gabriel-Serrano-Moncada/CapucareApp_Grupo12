package com.example.capucareapp_grupo12.ui.data.remote

import com.example.capucareapp_grupo12.ui.data.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}