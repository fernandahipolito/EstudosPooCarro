package com.example.exemplopoocarro

class MotorGasolina: MotorCombustao() {
    override fun gastando() {
        nivelCombustivel = nivelCombustivel--
        println("gastando combustível, nível agora é $nivelCombustivel")
    }
}