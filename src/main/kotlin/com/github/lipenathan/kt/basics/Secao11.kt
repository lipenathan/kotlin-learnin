package com.github.lipenathan.kt

fun main() {
    println(media1(1f, 2f, 3f, 4f, 5f))
}

fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma/notas.size)
}

fun <T> media1(vararg notas: T): Double {
    var soma = 0.0
    for (n in notas) {
        if (n is Double) {
            soma += n
        }
    }
    return (soma/notas.size)
}