package com.example.photoappapiusers.service

import com.example.photoappapiusers.domain.repository.UserRepository
import com.example.photoappapiusers.web.mapper.UserMapper
import com.example.photoappapiusers.web.model.UserDto
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(private val mapper: UserMapper,
                      private val repository: UserRepository,
                      private val encoder: PasswordEncoder) : UserService {

    override fun create(userDto: UserDto): UserDto {
        userDto.userId = UUID.randomUUID().toString()
        userDto.encryptedPassword = encoder.encode(userDto.password)
        val user = mapper.userDtoToUser(userDto)
        val savedUser = repository.save(user)
        return mapper.userToUserDto(savedUser)
    }
}