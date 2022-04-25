package com.example.exemplopoocarro

class MotorCombustao : MotorImpl() {


     private var nivelCombustivel: Int = 2
    //protected quer dizer que o filho vai conseguir mudar o nivel do combustível

    override fun gastando() {

    }

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }
}