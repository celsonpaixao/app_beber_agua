package com.celsonpaixao.appbebergua.model

import kotlin.text.*

class CalcularModel {
    private var jovemMl = 40.0
    private var adultMl = 35.0
    private var idosoMl = 30.0
    private var semiMortoMl = 25.0


    private var resultadoML = 0.0


    private fun formaula(peso: Double, ml: Double): Double {
        return peso * ml
    }

    fun calculeResultML(peso: Double, idade: Double) {

        if (idade <= 17) {

            resultadoML = formaula(peso, jovemMl)

        } else if (idade <= 55) {

            resultadoML = formaula(peso, adultMl)

        } else if(idade <= 65){
            resultadoML = formaula(peso, idosoMl)
        } else {
            resultadoML = formaula(peso, semiMortoMl)
        }

    }

    fun getResultadoML(): Double {
        return String.format("%.2f", resultadoML).toDouble()
    }

}