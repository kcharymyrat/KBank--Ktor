package com.example

import User
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }

    val user = User(id = 1, name = "John Doe")

    routing {
        get("/") {
            call.respond(user)
        }

        get("/account") {
            val service = RetrofitManager.getBankingService()
            val account = service.getAccount()
            call.respond(UserAccount(user = user, account = account))
        }
    }
}