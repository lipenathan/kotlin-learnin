fun main() {
    val data = gerarDados()

    println(data.filter { it.nome == "Lasanha" })
    println(data.any { it.nome == "Lasanha" })
    val first2 = data.take(2)
    val last2 = data.takeLast(2)
    println(first2)
    println(last2)
    //Maior valor do atributo passado para comparação
    val maxCaloria = data.maxOf { it.calorias }
    //Receita com o maior valor passado para comparação
    val receitaMaiorCaloria = data.maxByOrNull { it.ingredientes.size }
    println(maxCaloria)
    println("Receita com mais ingredientes ${receitaMaiorCaloria}")

    listOf(1, 2, 5, 9, 8, 6, 1, 4, 7, 6, 8, 2, 3).distinct().let { print(it) }
}

fun gerarDados(): List<Receita> {
    return listOf(
        Receita("Lasanha", 700, listOf(Ingrediente("frango", 600),
            Ingrediente("Massa", 2), Ingrediente("Molho", 1))),
        Receita("Batata Recheada", 420, listOf(Ingrediente("batata", 2),
            Ingrediente("carne moída", 600), Ingrediente("molho", 2))),
        Receita("Fricasse", 600, listOf(Ingrediente("frango", 1000),
            Ingrediente("milho", 400), Ingrediente("creme de leite", 2))),
        Receita("Arroz Temperado", 250, listOf(Ingrediente("Arroz", 1),
            Ingrediente("Cenoura", 3), Ingrediente("Bacon", 500))),
        Receita("Pão Caseiro", 300, listOf(Ingrediente("Trigo", 1000),
            Ingrediente("Ovo", 3), Ingrediente("Leite", 1),
            Ingrediente("Fermento", 100)))
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente>)
data class Ingrediente(val nome: String, val quantiadade: Int)