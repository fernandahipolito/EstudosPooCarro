package com.example.exemplopoocarro

class MotorAlcool : MotorCombustao() {
    override fun gastando() {
        nivelCombustivel -= 2
        println("gastando combustível, nível agora é $nivelCombustivel")
    }
}