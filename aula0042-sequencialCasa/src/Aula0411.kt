fun main(){
    // 1
    println("- atividade 1")
    print("- digite a nota 1: ")
    var nota1 = readLine()!!.toDouble()
    print("- digite a nota 2: ")
    var nota2 = readLine()!!.toDouble()
    print("- digite a nota 3: ")
    var nota3 = readLine()!!.toDouble()
    print("- digite a nota 4: ")
    var nota4 = readLine()!!.toDouble()
    println("A média é ${(nota1+nota2+nota3+nota4)/4}")
}