package exercicio03

class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>) {
        var sum = 0
        conjuntoDeInteiros.forEach {
            sum += it
        }
        println("soma total: $sum")
    }
}