data class Pessoa(val nome: String, val estado: Estado) {
}

data class Estado(val sigla: String, val nome: String) {
}

fun main() {
    val pessoa1 = Pessoa("EU", Estado("RN", "Rio Grande do Norte"))
    val pessoa2 = Pessoa("TU", Estado("RN", "Rio Grande do Norte"))
    val pessoa3 = Pessoa("ELE", Estado("RN", "Rio Grande do Norte"))
    val pessoa4 = Pessoa("NÓS", Estado("SP", "São Paulo"))
    val pessoa5 = Pessoa("VÓS", Estado("RJ", "Rio"))
    val pessoa6 = Pessoa("ELES", Estado("RJ", "Rio"))


    val pessoas = listOf(
        pessoa1,
        pessoa2,
        pessoa3,
        pessoa4,
        pessoa5,
        pessoa6
    )


    /*
    var agrupadorPorEstado =
        mutableMapOf<String, MutableList<Pessoa>>()

    pessoas.forEach {
        if (!agrupadorPorEstado.containsKey(it.estado.sigla)) {
            agrupadorPorEstado[it.estado.sigla] = mutableListOf()
        }
        agrupadorPorEstado[it.estado.sigla]?.add(it)
    }*/



    println(pessoas.groupBy { it.estado.sigla })
}

