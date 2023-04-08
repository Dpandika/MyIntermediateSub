package com.example.myintermediatesub.request

data class UserSession(
    val name: String,
    val token: String,
    val userId: String,
    val isLogin: Boolean
)
