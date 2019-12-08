package com.example.photoappapiusers.web.mapper

import com.example.photoappapiusers.domain.model.User
import com.example.photoappapiusers.web.model.UserDto
import com.example.photoappapiusers.web.request.CreateUserRequest
import com.example.photoappapiusers.web.response.CreateUserResponse
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {

    fun userToUserDto(user: User): UserDto

    fun userDtoToUser(user: UserDto): User

    fun createUserRequestToUserDto(request: CreateUserRequest): UserDto

    fun userDtoToCreateUserResponse(user: UserDto): CreateUserResponse

}