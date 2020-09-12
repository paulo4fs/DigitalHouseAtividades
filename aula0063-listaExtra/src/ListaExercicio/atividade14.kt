package ListaExercicio

import kotlin.math.max

fun main() {
    var count = 0
    var num = 0
    while(count<=100){
        if(num%2!=0){
            println(num)
            count++
        }
        num++
    }
}