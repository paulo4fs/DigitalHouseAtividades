fun main() {
    println("Digite a nota 1: ")
    var nota1 = readLine()!!.toDouble()
    println("Digite a nota 2: ")
    var nota2 = readLine()!!.toDouble()
    var media = (nota1+nota2)/2
    if (media < 7) {
        println("Aluno reprovado!")
    } else if (media == 10.0) {
        println("Aluno aprovado com distinção!")
    } else {
        println("Aluno aprovado!")
    }
}