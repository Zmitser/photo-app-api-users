package com.example.photoappapiusers.domain.repository

import com.example.photoappapiusers.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>