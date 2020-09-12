
fun main(){
    println("Digite um número inteiro: ")
    var numeroInteiro = readLine()!!.toInt()
    if (numeroInteiro %2 == 0) {
        println("É PAR\n")
    } else {
        print("É ÍMPAR\n")
    }
}
