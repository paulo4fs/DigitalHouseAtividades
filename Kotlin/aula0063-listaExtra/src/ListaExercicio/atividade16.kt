package ListaExercicio

import kotlin.math.max
import kotlin.random.Random

fun main() {
    var num = 0;
    var count = 0;
    while(count<=100){
        if(num%2==0){
            println(num)
            count++
        }
        num++
    }
}