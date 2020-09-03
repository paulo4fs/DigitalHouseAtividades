fun exe1(){
    // 1
    println("- atividade 1 parte 1")
    print("- digite um número: ")
    var num = readLine()!!.toInt()
    println("- O número informado foi $num\n")
}

fun exe2(){
    // 2
    println("- atividade 2 parte 1")
    println("- digite dois números: ")
    print("- digite o primeiro número: ")
    var num1 = readLine()!!.toInt()
    print("- digite o segundo número: ")
    var num2 = readLine()!!.toInt()
    println("- A soma dos números é: ${num1 + num2}\n")
}

fun exe3(){
    // 3
    println("- atividade 3 parte 1")
    print("- digite uma medida em metros: ")
    var metros = readLine()!!.toInt()
    println("- A medida equivale a ${metros * 100} cm\n")
}

fun temperatura(){
    // 1
    println("- atividade 1 parte 2")
    print("Digite a temperatura em Farenheit: ")
    var tempF = readLine()!!.toDouble()
    println("- Essa temperatura em Celcius é: ${5*((tempF-32)/9)} \n")
}

fun salario(){
    // 2
    println("- atividade 2 parte 2")
    print("Digite o salário por hora: ")
    var salarioHora = readLine()!!.toDouble()
    print("Digite o número de horas trabalhadas no mês: ")
    var horas = readLine()!!.toInt()
    var salarioBruto = horas * salarioHora
    println("+ Salário Bruto : \$$salarioBruto")
    println("- IR (11%) : \$${salarioBruto*0.11}")
    println("- INSS (8%) : \$${salarioBruto*0.08}")
    println("- Sindicato ( 5%) : \$${salarioBruto*0.05}")
    println("= Salário Líquido : \$${salarioBruto*0.76}")
}

fun main(){
    exe1()
    exe2()
    exe3()
    temperatura()
    salario()
}