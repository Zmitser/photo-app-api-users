package com.example.photoappapiusers.domain.model

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue
        var id: Long?,
        @Column(nullable = false, length = 50)
        var firstName: String?,
        @Column(nullable = false, length = 50)
        var lastName: String?,
        @Column(nullable = false, unique = true)
        var userId: String?,
        @Column(nullable = false, length = 120, unique = true)
        var email: String?,
        @Column(nullable = false, unique = true)
        var password: String?,
        @Column(nullable = false, unique = true)
        var encryptedPassword: String?
) {
    constructor() : this(null, null, null, null, null, null, null)
}