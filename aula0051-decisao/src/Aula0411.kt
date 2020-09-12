fun main(){
    println("Qual o seu sexo? ")
    var sexo = readLine()!!.toLowerCase()
    when(sexo){
        "f" -> println("FEMININO\n")
        "m"-> println("MASCULINO\n")
        else -> println("Sexo inválido\n")
    }
}