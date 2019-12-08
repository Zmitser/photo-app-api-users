package com.example.photoappapiusers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder
import java.net.InetAddress

@SpringBootApplication
@EnableDiscoveryClient
class PhotoAppApiUsersApplication {

    @Bean
    fun encoder() = Pbkdf2PasswordEncoder()
}

fun main(args: Array<String>) {
    runApplication<PhotoAppApiUsersApplication>(*args)
}
