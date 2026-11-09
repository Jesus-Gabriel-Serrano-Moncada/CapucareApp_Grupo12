package com.example.capucareapp_grupo12.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.capucareapp_grupo12.ui.data.model.Post
import com.example.capucareapp_grupo12.ui.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel {
    private val repository = PostRepository()

    private val _postList = MutableStateFlow<List<Post>>(emptyList())
    val postList: StateFlow<List<Post>> = _postList

    init {
        fecthPosts()
    }

    private fun fecthPosts() {
        TODO("Not yet implemented")
    }

    private fun fetchPosts(){
        val viewModelScope = null
        viewModelScope?.launch{
            try{
                _postList.value = repository.getPosts()

            }catch(e: Exception){
                println("Error al obtener los datos ${e.localizedMessage}")
            }
        }
    }

}