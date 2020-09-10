fun main(){
    exe1()
    exe2()
    exe3()
    exe4()
}

fun exe1(){
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

fun exe2(){
    // 2
    println("- atividade 2")
    println("- Quanto vale sua hora? ")
    var num1 = readLine()!!.toInt()
    println("- Quantas horas você trabalhou? ")
    var num2 = readLine()!!.toInt()
    println("- Você receberá R\$${num1 * num2}")
}

fun exe3(){
    // 3
    println("- atividade 3")
    print("- Digite a altura:: ")
    var metros = readLine()!!.toDouble()
    println("- Para homens: ${(72.7 * metros) - 58}")
    println("- Para mulheres: ${(62.1 * metros) - 44.7}")
}

fun exe4(){
    // 1
    println("- atividade 4")
    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()
    if(peso>50){
        println("Excedeu ${peso-50}")
        var multa : Double = (peso-50)*4
        println("O valor a ser pago é de R\$${multa}")
    }
}
