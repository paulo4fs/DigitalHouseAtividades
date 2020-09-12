package ListaExercicio

import kotlin.math.max

fun main() {
    println("digite um número:")
    var num1 = readLine()!!.toInt()
    println(checador(num1))

}

fun checador(numero: Int): Boolean {
    if(numero%2==0){
        return true
    }
    return false
}