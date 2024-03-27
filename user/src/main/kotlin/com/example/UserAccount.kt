package com.example

import Account
import User
import kotlinx.serialization.Serializable

@Serializable
class UserAccount(
    val user: User,
    val account: Account
)