package com.example.kolokwium_1_jezyki_programowania

import kotlin.math.pow
import kotlin.math.sqrt

class Okrag(x: Double, y:Double, r:Double){
    var x_1: Double
    var y_1: Double
    var r_1: Double

    init {
        x_1 = x
        y_1 = y
        r_1 = r

        if ( r_1 <= 0.0)
            throw IllegalArgumentException("Wartość promienia nieprawidłowa")
    }

    fun Skalowanie(k: Double){
        if (k > 0){
            r_1 = r_1*k
        }
    }

    fun Zawartosc(a: Double, b:Double): Double{
        var odleglosc = sqrt((a - x_1).pow(2) + (b - y_1).pow(2))
             if (odleglosc <= r_1){
             }

            return odleglosc
    }
}

fun main(){
    var x: Double = 8.0
    var y: Double = 5.0
    var r: Double = 2.0
    var newk: Double = 2.0

    var okrag =

}




















