package com.example.exemplopoocarro

class Carro (
    private val motorImpl: MotorImpl
    ): Motor by motorImpl {
// injeção de dependência com um design pattern de delegate
    fun anda() {
        when {
            !motorImpl.estaLigado() -> println("Liga o carro primeiro né?")
            !motorImpl.temAutonomia() -> {

                when(motorImpl) {
                    is MotorEletrico -> println("Tem que carregar né?")
                    is MotorCombustao -> println("Coloca combustível né?")
                }
            }
            else -> {
                motorImpl.gastando()

                when(motorImpl) { //is faz a verificação do tipo de motor
                    is MotorEletrico -> println("Carro andando...")
                    is MotorCombustao -> println("Carro andando:vruuum vruuum")
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
