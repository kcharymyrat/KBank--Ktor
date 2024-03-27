package com.example

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitManager {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8090")
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()

    private val service = retrofit.create(BankingService::class.java)

    fun getBankingService(): BankingService = service
        ?: throw Exception("The banking service is not responding")
}