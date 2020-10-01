fun main(){
    // 2
    println("- atividade 2")
    println("- Quanto vale sua hora? ")
    var num1 = readLine()!!.toInt()
    println("- Quantas horas você trabalhou? ")
    var num2 = readLine()!!.toInt()
    println("- Você receberá R\$${num1 * num2}")
}