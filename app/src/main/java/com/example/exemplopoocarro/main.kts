package com.example.exemplopoocarro

fun main() {

    val motorCombustao = MotorCombustao()
    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.anda()

    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
}

