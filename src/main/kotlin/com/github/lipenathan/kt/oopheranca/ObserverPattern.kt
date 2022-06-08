package com.github.lipenathan.kt.oopheranca

interface Subject {
//    val subcribers: MutableList<Observer>
    fun attach(o: Observer)
    fun detach(o: Observer)
    fun notifies()
}

interface Observer {
    fun update(newState: Any)
}

class Relogio : Subject {
    var subcribers: MutableList<Observer> = mutableListOf()
    var minuto: Int = 0
    var hora: Int = 0

    fun atualizarTempo(tempo: Int) {
        minuto += tempo
        if (minuto == 60) {
            minuto = 0
            hora++
        }
        notifies()
    }

    override fun attach(o: Observer) {
        subcribers.add(o)
    }

    override fun detach(o: Observer) {
        subcribers.remove(o)
    }

    override fun notifies() {
        subcribers.forEach { it.update(this) }
    }
}

class RelogioObserver : Observer {
    var relogio: Relogio = Relogio()
    override fun update(newState: Any) {
        this.relogio = newState as Relogio
    }
}

fun main() {
    var relogio = Relogio()
    var observer = RelogioObserver()
    relogio.attach(observer)

    for (i in 1..20) {
        Thread.sleep(1000)
        relogio.atualizarTempo(10)
        if (relogio.hora < 2) {
            println("Estado atual do relogio do observador|| Hora: ${observer.relogio.hora} Minuto: ${observer.relogio.minuto}")
        } else {
            relogio.detach(observer)
        }
    }
}