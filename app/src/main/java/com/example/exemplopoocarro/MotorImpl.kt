package com.example.exemplopoocarro

abstract class MotorImpl : Motor {
    private var ligado: Boolean = false

    override fun ligar() {
        println("ligando motor...")
        ligado = true
    }

    override fun desligar() {
        println("desligando motor...")
        ligado = false
    }
    fun estaLigado(): Boolean {
        return ligado
    }

    abstract fun temAutonomia(): Boolean
        //a implementação está nas classes que estão herdando de motor
        //características que podem ser modificadas
    //implementado em MotorCombustão e MotorElétrico(classes filhas de motor)
    //tosdos que herdam de motor tem obrigatoriamente que implementar temAutonomia
    abstract fun gastando()
}