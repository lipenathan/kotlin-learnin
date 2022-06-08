package com.github.lipenathan.kt

fun main() {
    val s: String? = null
    try {
        println(s?.length)
        println(s!!.length)
    } catch(e: NullPointerException) {
        println("Variável nula")
    }

    // função elvis
    println(s ?: "nulo")

    /**
     * kotlin não possui operador ternário, porém o if else do kotlin retorna valor e pode cumprir a mesma função
     */
    val idade = 17
    val str = if (idade > 18) "maior de idade" else "menor de idade"

    println(str)
}