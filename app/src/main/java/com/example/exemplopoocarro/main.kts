package com.example.exemplopoocarro

fun main() {

    val motor = Motor()
    val fuca = Carro(motor)
    fuca.ligar()
    fuca.anda()

    val tesla = Carro(motor)
    tesla.ligar()
    tesla.anda()
}

