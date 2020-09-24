package exercicio04

class GuardaVolumes() {
    val chave = mutableMapOf<Int, MutableList<Peca>>()
    var contador = 0

    fun guardarPecas(listaDePeca: MutableList<Peca>): Int {
        chave[contador] = listaDePeca
        println("#############")
        println("peça guardada")
        contador++
        return contador - 1
    }

    fun mostrarPecas() {
        println("#############")
        println("chaves:")
        if (chave.isNotEmpty()) {
            for (key in chave.keys) {
                println(key)
                chave[key]!!.forEach {
                    println("${it.marca}, ${it.modelo}")
                }
            }
        } else {
            println("volume vazio")
        }
    }

    fun mostrarPeca(numero: Int) {
        if (chave.containsKey(numero)) {
            println("#############")
            println("chave encontrada")
            println("${numero}, ${chave[numero]}")
        } else {
            println("#############")
            println("chave não encontrada")
        }
    }

    fun devolverPecas(numero: Int) {
        if (chave.containsKey(numero)) {
            println("#############")
            println("chave: $numero, peças devolvidas")
            chave.remove(numero)
        } else {
            println("#############")
            println("chave não encontrada")
        }
    }
}