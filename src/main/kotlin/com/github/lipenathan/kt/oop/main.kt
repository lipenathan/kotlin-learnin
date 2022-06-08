package com.github.lipenathan.kt.oop

class Pessoa(val anoNascimento: Int, var nome: String) {
    var doc: String = ""

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }

    fun dormir() {
    }

    fun acordar() {
    }
}

class Carro(ano: Int, modelo: String) {
    var ano: Int
    var modelo: String

    init {
        this.ano = ano
        this.modelo = modelo
    }
}

class Animal (var raca: String,var cor: String) {
    constructor(): this(raca = "", cor = "")
}

class Professor(var idade: Int = 0) {
    var nome = ""
    get() {
        var nome = "Este é um tratamento que foi feito no nome pelo seu get ###$field###"
        return nome
    }

    constructor(nome: String, idade: Int): this(idade) {
        this.nome = nome
    }
}

private enum class Prioridade constructor(var valor: Int) {
    BAIXA(1), MEDIA(5), ALTA(10)
}

fun main() {
    var pessoa: Pessoa = Pessoa(1996, "Nathan", "00011122233")

    println(pessoa.anoNascimento)
    println(pessoa.nome)
    println(pessoa.doc)

    var carro = Carro(2015, "Corsa")

    var animal = Animal(cor = "Amarela", raca = "onça")
    var animal2 = Animal()

    println("O animal ${animal.raca} tem a cor ${animal.cor}")
    println(animal2)

    var professor1 = Professor()
    var professor2 = Professor("Fulano", 44)
    println("O nome do professor é ${professor2.nome} e sua idade é ${professor2.idade}")

    Prioridade.values()

    fun Professor.meuNovoMetodo(a: Int, b: Int): Unit {
        this.idade = this.idade + (a * b)
    }

    var pri = Prioridade.BAIXA
    println(Prioridade.MEDIA.ordinal)

    println("A prioridade é ${pri.valor}")

    var p = Professor("Antonio", 50)
    p.meuNovoMetodo(2, 2)
    println("a nova idade é ${p.idade }")


}