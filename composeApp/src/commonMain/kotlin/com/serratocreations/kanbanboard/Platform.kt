package com.serratocreations.kanbanboard

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform