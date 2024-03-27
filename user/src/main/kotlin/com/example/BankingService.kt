package com.example

import Account
import retrofit2.http.GET

interface BankingService {
    @GET("/")
    suspend fun getAccount(): Account
}