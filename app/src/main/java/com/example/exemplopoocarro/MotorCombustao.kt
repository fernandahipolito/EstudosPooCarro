package com.example.exemplopoocarro

open class MotorCombustao : MotorImpl() {


     var nivelCombustivel: Int = 2
    //protected quer dizer que o filho vai conseguir mudar o nivel do combustível

    override fun gastando() {

    }

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }
}