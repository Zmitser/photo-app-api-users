package com.example.photoappapiusers.web.controller

import com.example.photoappapiusers.service.UserService
import com.example.photoappapiusers.web.mapper.UserMapper
import com.example.photoappapiusers.web.request.CreateUserRequest
import com.example.photoappapiusers.web.response.CreateUserResponse
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.MediaType.APPLICATION_XML_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import javax.validation.Valid


@RestController
@RequestMapping("/api/v1/users")
class UserController(private val service: UserService,
                     private val mapper: UserMapper) {


    @PostMapping(
            produces = [APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE],
            consumes = [APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE]
    )
    fun create(@Valid @RequestBody request: CreateUserRequest): ResponseEntity<CreateUserResponse> {
        val user = mapper.createUserRequestToUserDto(request)
        val saved = service.create(user)
        val response = mapper.userDtoToCreateUserResponse(saved)
        return ResponseEntity.created(URI.create("/api/v1/users/${saved.userId}")).body(response)
    }
}