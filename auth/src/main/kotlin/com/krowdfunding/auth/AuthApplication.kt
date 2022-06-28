package com.krowdfunding.auth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing
class AuthApplication

fun main(args: Array<String>) {
    runApplication<AuthApplication>(*args)
}
