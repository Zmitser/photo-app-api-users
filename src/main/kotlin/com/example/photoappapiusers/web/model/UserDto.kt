package com.example.photoappapiusers.web.model

data class UserDto(
        var firstName: String?,
        var lastName: String?,
        var password: String?,
        var email: String?,
        var userId: String?,
        var encryptedPassword: String?
) {
    constructor() : this(null, null, null, null, null, null)
}