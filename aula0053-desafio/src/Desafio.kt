import java.lang.Double.max

fun main() {
    // o mais alto, mais baixo, mais gordo e mais magro, código
    // média das alturas e média do peso
    var codigo = 1
    var peso = 0.0
    var altura = 0.0

    var maxPeso = 0.0
    var minPeso = 0.0
    var maxAltura = 0.0
    var minAltura = 0.0

    var contador = 0
    var mediaAltura = 0.0
    var mediaPeso = 0.0

    var registroMaxPeso = ""
    var registroMinPeso = ""
    var registroMaxAltura = ""
    var registroMinAltura = ""

    while (true) {
        println("para sair digite 0")
        print("Digite seu código: ")
        codigo = readLine()!!.toInt()
        if (codigo == 0) {
            break
        }
        contador++
        print("Digite seu peso: ")
        peso = readLine()!!.toDouble()
        print("Digite sua altura: ")
        altura = readLine()!!.toDouble()
        if (maxPeso < peso) {
            maxPeso = peso
            registroMaxPeso = "aluno $codigo tem o maior peso: $maxPeso"
        }
        if (minPeso == 0.0) {
            minPeso = peso
            registroMinPeso = "aluno $codigo tem o menor peso: $minPeso"
        } else if (minPeso > peso) {
            minPeso = peso
            registroMinPeso = "aluno $codigo tem o menor peso: $minPeso"
        }
        if (maxAltura < altura) {
            maxAltura = altura
            registroMaxAltura = "aluno $codigo tem a maior altura: $maxAltura"
        }
        if (minAltura == 0.0) {
            minAltura = altura
            registroMinAltura = "aluno $codigo tem a menor altura: $minAltura"
        } else if (minAltura > altura) {
            minAltura = altura
            registroMinAltura = "aluno $codigo tem a menor altura: $minAltura"
        }
        mediaPeso += peso
        mediaAltura += altura
    }
    println(registroMaxAltura)
    println(registroMinAltura)
    println(registroMaxPeso)
    println(registroMinPeso)
    println("A média de altura é ${mediaAltura/contador}")
    println("A média de peso é ${mediaPeso/contador}")
}