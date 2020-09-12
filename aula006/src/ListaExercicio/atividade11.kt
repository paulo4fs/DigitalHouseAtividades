package ListaExercicio

import kotlin.math.max

fun main(){
    println("digite o primeiro número:")
    var num1 = readLine()!!.toInt()
    println("digite o segundo número:")
    var num2 = readLine()!!.toInt()
    println("digite o terceiro número:")
    var num3 = readLine()!!.toInt()
    println("o maior número é: ${checador(num1,num2,num3)}")
}

fun checador(primeiro:Int,segundo:Int,terceiro:Int):Int{
    return max(primeiro,max(segundo,terceiro))
}