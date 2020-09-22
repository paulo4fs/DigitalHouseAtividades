package Exceptions

import kotlin.ArithmeticException

fun main() {
    var calculo = CalculoMatematico()
    try {

        calculo.divisao(4, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }
}