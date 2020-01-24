package com.example.android.dagger.user

import kotlin.random.Random

data class User(val username: String, val unreadNotifications: Int = randomInt())

private fun randomInt(): Int {
    return Random.nextInt(until = 100)
}
