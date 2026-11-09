package com.example.capucareapp_grupo12.ui.repository

import com.example.capucareapp_grupo12.ui.data.model.Post
import com.example.capucareapp_grupo12.ui.data.remote.RetrofitInstance

class PostRepository{
    suspend fun getPosts(): List<Post>{
        return RetrofitInstance.api.getPosts()
    }
}