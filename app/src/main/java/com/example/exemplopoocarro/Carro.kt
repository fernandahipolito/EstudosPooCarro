package com.example.exemplopoocarro

class Carro (
    private val motor: Motor
    ){

    fun ligar() {
        motor.ligar()
    }

    fun desligar() {
        motor.desligar()
    }
    fun anda() {
        when {
            !motor.estaLigado() -> println("Liga o carro primeiro né?")
            !motor.temCombustivel() -> {
                println("Coloca combustível né?")
                desligar()
            }
            else -> {
                motor.gastandoCombustivel()
                println("Carro andando:vruuum vruuum")
                }
            }
        }
    }

    fun freia() {
        println("Carro freiando")
    }

    fun buzina() {
    println("Carro buzinando")
    }
}