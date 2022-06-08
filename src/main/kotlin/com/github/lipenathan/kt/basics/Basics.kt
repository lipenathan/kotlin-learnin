import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Scanner

/**
 * set, functions, scope functions, loop, lambda, enum
 *
 * Tipos Básicos
 * Inteiro -> Byte, Short, Int, Long
 * Flutuantes -> Float(5.78f), Double
 * Boolean
 * Char, String
 */
fun main() {
    val set = setOf(
        "Felipe",
        "Joana",
        "Pedro"
    )
    println(set)
    var nome: String
    val scanner = Scanner(System.`in`)
    println("Insira um nome:\n")
    /**
     * scope funcion: pega uma variável e "trabalha" com ela dentro de um bloco através do 'it'
     */
//    nome = scanner.nextLine().let {" o nome digitato foi $it"}
//    println(nome)
//    nome = nome.let {
//        val a = " e agora um novo teste"
//        it + a
//    }
//    println(nome)

    // enum
    var p = Pessoa("Jorge", 15).run { idade + 10 }
    println(p)
    println(Color.RED.rgb)

    val inteiros = listOf(1, 2, 3, 4, 5, 6, 7)
    val resultado = filtrar(inteiros, { it % 2 == 0 })
    println(resultado)

    var b = true

    var a = 1
    a++
    println("a = $a")

    var str = "Uma função"
    str.plus(" aaaaa")

    println(str)
    println(str[7])

    var cartao = "1234 5678 5552 2211"
    var substring = cartao.substring(1, 9)

    var valor = 15.68855f
    var valorBd = BigDecimal("15.68855")
    valorBd.setScale(2, RoundingMode.CEILING)
    val fmt = "%.2f"
    valor
    println("Valor formatado $valorBd e o valor não formatado $valor")

    //when (switch case)
    val teste = "cde"
    when (a) {
        1 -> str = "5"
        2 -> str = "6"
        3 -> str = "7"
    }
    println(str)

    // when com range
    when (a) {
        in 1..10 -> str = "O valor está entre 1 e 10"
        in 2..20 -> str = "O valor está entre 11 e 20"
        in 3..30 -> str = "O valor está entre 21 e 30"
    }
    println(str)

//    print("Insira um texto: ")
//    var s = readLine()
//    println(s)
//    print("Digite um valor para lado a: ")
//    val qa = readLine()?.toInt()
//    print("Digite um valor para lado b: ")
//    val qb = readLine()?.toInt()
//    if (qa != null && qb != null) {
//        quadrado(qa, qb)
//    }
    for (i in 1..10 step 2) {
        println(i)
    }
}

// Higher-Order Functions and Lambda
fun filtrar(
    lista: List<Int>,
    filtro: (Int) -> (Boolean)
): List<Int> { //método para filtrar lista que recebe função como parâmetro
    val novaLista = arrayListOf<Int>()
    for (item in lista) {
        if (filtro(item)) {
            novaLista.add(item)
        }
    }
    return novaLista
}

data class Pessoa(var nome: String, var idade: Int = 10)

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun quadrado(a: Int = 1, b: Int = 1) {
    if (a != null && b != null) {
        if (a == b) {
            for (i in 1..a) {
                print("_  ")
            }
            for (i in 1..b) {
                println()
                print("|")
                for (j in 1..a) {
                    print(" ")
                }
                print("|")
            }
            println()
            for (i in 1..a) {
                print("_  ")
            }
        } else {
            println("Não é um quadrado")
        }
    } else {
        println("Valores não podem ser nulos")
    }
}