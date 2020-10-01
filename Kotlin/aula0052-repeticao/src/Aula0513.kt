import java.lang.Integer.max
import java.lang.Integer.min

fun main() {
    println("Digite o primeiro número:")
    var numero1 = readLine()!!.toInt()
    println("Digite o segundo número:")
    var numero2 = readLine()!!.toInt()
    for(i in min(numero1,numero2)..max(numero1,numero2)) {
        println(i)
    }
}