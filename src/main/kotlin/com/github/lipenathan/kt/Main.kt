import java.util.Scanner

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

    val inteiros = listOf(1,2,3,4,5,6,7)
    val resultado = filtrar(inteiros, {it % 2 == 0 })
    println(resultado)
}
    // Higher-Order Functions and Lambda
    fun filtrar(lista:List<Int>, filtro: (Int) -> (Boolean)): List<Int> { //método para filtrar lista que recebe função como parâmetro
        val novaLista = arrayListOf<Int>()
        for (item in lista) {
            if (filtro(item)) {
                novaLista.add(item)
            }
        }
        return novaLista
    }

data class Pessoa(var nome: String,var idade:Int = 10)

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}