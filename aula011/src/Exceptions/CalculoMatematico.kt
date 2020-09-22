package Exceptions

import java.lang.ArithmeticException

class CalculoMatematico() {
    fun divisao(a: Int, b: Int): Int {
        if (b == 0) throw ArithmeticException("Divisao por zero")
        return a / b
    }
}