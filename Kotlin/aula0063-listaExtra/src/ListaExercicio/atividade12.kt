package ListaExercicio

import kotlin.math.max

fun main() {
    println("digite o primeiro texto:")
    var text1 = readLine()!!.toString()

    println("digite o segundo texto:")
    var text2 = readLine()!!.toString()

    if (text1.length == text2.length && checador(text1, text2)) {
        println("os textos são iguais")
    } else {
        println("os textos são diferentes")
    }
}

fun checador(primeiro: String, segundo: String): Boolean {
    for (index in primeiro.indices) {
        println(primeiro[index])
        if (primeiro[index] != segundo[index]) {
            return false
        }
    }
    return true
}