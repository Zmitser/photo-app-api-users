package com.example.photoappapiusers.web.response

data class CreateUserResponse(var firstName: String?, var lastName: String?, var userId: String?, var email: String?) {

    constructor() : this(null, null, null, null)
}