package sequencial

fun main(){
    // 1
    println("- atividade 1 parte 2")
    print("Digite a temperatura em Farenheit: ")
    var tempF = readLine()!!.toDouble()
    println("- Essa temperatura em Celcius é: ${5*((tempF-32)/9)} \n")
}