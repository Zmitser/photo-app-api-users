package com.example.photoappapiusers.web.request;

import java.io.Serializable
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class CreateUserRequest(
        @NotNull(message = "First name cannot be null")
        @Size(min = 2, message = "First name must not be less 2 characters")
        val firstName: String,
        @NotNull(message = "Last name cannot be null")
        @Size(min = 2, message = "Last name must not be less 2 characters")
        val lastName: String,
        @NotNull(message = "Password cannot be null")
        @Size(min = 8, max = 16, message = "Password must not less than or be equal  8 and greater than 16")
        val password: String,
        @NotNull(message = "Email cannot be null")
        @Email
        val email: String
) : Serializable
