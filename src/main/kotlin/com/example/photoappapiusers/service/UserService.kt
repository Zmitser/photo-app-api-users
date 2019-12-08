package com.example.photoappapiusers.service

import com.example.photoappapiusers.web.model.UserDto

interface UserService {

    fun create(userDto: UserDto): UserDto
}