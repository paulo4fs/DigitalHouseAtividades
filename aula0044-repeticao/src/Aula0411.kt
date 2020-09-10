fun main() {
    println("Qual o seu sexo? ")
    var sexo = readLine()!!.toLowerCase()
    when(sexo){
        "f" -> println("FEMININO")
        "m" -> println("MASCULINO")
        else -> println("Sexo inválido")
    }
}