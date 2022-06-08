open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    //objeto estático
    object static {
        var INVENTOR = "Alan Turing"
        init {
            println("teste")
        }
    }
}

//classes abstratas
abstract class Mamifero(val nome: String) {
    fun acordar(){}
    fun dormir(){}
    abstract fun falar()
}

class Cachorro(nome: String): Mamifero(nome) {
    override fun falar() {
        TODO("Not yet implemented")
    }
}

fun main() {
    var c: Computador = Computador("ACER")
    var e: Eletronico = Eletronico("ALEXA")
    c.ligar()
    c.desligar()

    Computador.static.INVENTOR
    Computador.static.INVENTOR
    Computador.static.INVENTOR
    Computador.static.INVENTOR

    var Mamifero = Cachorro("Totó")
}