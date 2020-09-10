fun main() {
    exercicio1()
    exercicio2()
    exercicio3()
}

fun exercicio1 (){
    println("Qual o seu sexo? ")
    var sexo = readLine()!!.toLowerCase()
    when(sexo){
        "f" -> println("FEMININO\n")
        "m"-> println("MASCULINO\n")
        else -> println("Sexo inválido\n")
    }
}
fun exercicio2(){
    println("Digite um número inteiro: ")
    var numeroInteiro = readLine()!!.toInt()
    if (numeroInteiro %2 == 0) {
        println("É PAR\n")
    } else {
        print("É ÍMPAR\n")
    }
}
fun exercicio3() {
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