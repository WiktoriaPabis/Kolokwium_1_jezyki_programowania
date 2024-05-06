package com.example.kolokwium_1_jezyki_programowania

import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author Wiktoria Pabiś
 *
 * Funkcja dla zadanej wejściowej listy intów zwraca listę, w której zawarte są liczby większe od
 * wszystkich liczb na poprzednich pozycjach.
 *
 * @return  result  mutowalna lista
 */
fun jesliWieksze(L: List<Int>): List<Int>{
    val result: MutableList<Int> = mutableListOf()
    var values = Int.MIN_VALUE

    for (elem in L) {
        if (elem > values) {
            result.add(elem)
            values = elem
        }
    }
    return result
}

/**
 * @author Wiktoria Pabiś
 */
fun main() {
    var listofL: MutableList<Int> = mutableListOf(1, 13, 4, 13, -10, 21, 9)
    var result1 = jesliWieksze(listofL)
    print(result1)
}



class jesliWiekszeTest {

    @Test

    fun jesliWieksze(){
        var listL = jesliWieksze(mutableListOf(3, 1, 6, 8, 3))
        var values = Int.MIN_VALUE
        assertEquals(mutableListOf(3, 6, 8), listL, "Niepoprawnie wykonane zadania")
    }
}
