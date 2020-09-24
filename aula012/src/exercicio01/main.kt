package exercicio01

data class Apelido(val apelidos: List<String>)

fun main() {
    //Exercício 1
    //1.
    var dicionario = mapOf<Int, String>(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )
    dicionario.forEach {
        if (it.key < 5) {
            println(it)
        }
    }
    //2.
    var apelido = mapOf<String, Apelido>(
        "João" to Apelido(listOf("Juan", " Fissura", "Maromba")),
        "Miguel" to Apelido(listOf("Night", "Watch", "Bruce", "Wayne", "Tampinha")),
        "Maria" to Apelido(listOf("Wonder", "Woman", "Mary", "Marilene")),
        "Lucas" to Apelido(listOf("Lukinha", " Jorge", "George"))
    )
    apelido.forEach {
        println("${it.key}, ${it.value}")
    }
    //Exercício 2
    //3.
    var listaVazia = ArrayList<Int>()
    listaVazia.add(1)
    listaVazia.add(5)
    listaVazia.add(5)
    listaVazia.add(6)
    listaVazia.add(7)
    listaVazia.add(8)
    listaVazia.add(8)
    listaVazia.add(8)
    //4.
    var setVazio = mutableSetOf<Int>()
    setVazio.add(1)
    setVazio.add(5)
    setVazio.add(5)
    setVazio.add(6)
    setVazio.add(7)
    setVazio.add(8)
    setVazio.add(8)
    setVazio.add(8)

    listaVazia.forEach {
        println(it)
    }
    setVazio.forEach {
        println(it)
    }
    //O set não possui valores repetidos, já o list permite valores repetidos
}
