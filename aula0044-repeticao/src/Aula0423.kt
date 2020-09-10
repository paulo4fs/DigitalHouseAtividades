fun main() {
    println("Digite um valor pra saber a sua tabuada:")
    var numero = readLine()!!.toInt()

    for(i in 1..10){
        println("$numero * $i = ${numero*i}")
    }
}