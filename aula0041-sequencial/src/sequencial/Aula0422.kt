package sequencial

fun main(){
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
    println("= Salário Líquido : \$${salarioBruto*0.76}")}