package com.example.exemplopoocarro

fun main() {

    val motorCombustao = MotorCombustao()
    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.anda()
    fuca.anda()
    fuca.anda()
    fuca.desligar()
    fuca.anda()

    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
}

