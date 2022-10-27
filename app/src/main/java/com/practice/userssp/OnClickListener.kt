package com.practice.userssp

import com.practice.userssp.models.User

interface OnClickListener {
    fun onClick(user : User, position : Int )
}