package ListaExercicio

import kotlin.math.max
import kotlin.random.Random

fun main() {
    var numA = Random.nextInt(0,100)
    var numB = Random.nextInt(0,100)
    var numC = Random.nextInt(0,100)
    var numD = Random.nextInt(0,100)
    println("A $numA B $numB C $numC D $numD")
    println(checker(numA,numB,numC,numD))
}
fun checker(num1:Int,num2:Int,num3:Int,num4:Int):Boolean{
    if((num1>num3 && num1>num4)||num2>num3 && num2>num4){
        return true
    }
    return false
}