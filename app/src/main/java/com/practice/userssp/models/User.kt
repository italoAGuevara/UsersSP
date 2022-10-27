package com.practice.userssp.models

data class User ( val id: Long, var name: String, var lastName: String, var url: String ){

    fun getFullName(): String = "$name $lastName"
}