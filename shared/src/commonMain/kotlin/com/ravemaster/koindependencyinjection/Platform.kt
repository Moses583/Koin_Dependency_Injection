package com.ravemaster.koindependencyinjection

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform