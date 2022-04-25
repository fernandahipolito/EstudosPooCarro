package com.example.exemplopoocarro

interface Motor {//contrato de implementação = interface
    //é só um contrato, não pode implementar nada

    fun ligar()
    fun desligar()
}

//um contrato para que a gente possa se comunicar com motor