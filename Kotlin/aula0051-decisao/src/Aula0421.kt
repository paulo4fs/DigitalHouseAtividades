fun main() {
    println("Digite um valor:")
    var valor = readLine()!!.toInt()
    if (valor % 2 === 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }
}