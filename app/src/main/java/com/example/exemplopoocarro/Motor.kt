package com.example.exemplopoocarro

class Motor {

    private var ligado: Boolean = false
     private var nivelCombustivel: Int = 2

     fun ligar() {
         println("Ligando o motor...")
          ligado = true
     }

     fun desligar() {
         println("Desligando o motor...")
          ligado = false
     }

     fun estaLigado(): Boolean {
         return ligado
     }

     fun temCombustivel(): Boolean {
          return nivelCombustivel > 0
     }

     fun gastandoCombustivel() {
          println("Gastando combustível,nível agora é: $nivelCombustivel")
          nivelCombustivel--
     }
}