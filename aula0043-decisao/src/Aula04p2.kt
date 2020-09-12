fun main() {
    exercicio1_2()
    exercicio2_2()
    exercicio3_2()
}

fun exercicio1_2() {
    println("Digite um valor:")
    var valor = readLine()!!.toInt()
    if (valor % 2 === 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }
}

fun exercicio2_2() {
    println("Digite o valor do saque:")
    var valorSaque = readLine()!!.toInt()
    var notas = 0
    if (valorSaque < 10) {
        println("Saque negado! Valor inferior ao mínimo.")
    } else if (valorSaque > 600) {
        println("Saque negado! Valor excede o máximo permitido.")
    } else {
        notas = valorSaque / 100
        if (notas > 0) {
            println("$notas Cédulas de R$100")
        }
        valorSaque = valorSaque - (100 * notas)
        notas = valorSaque / 50
        if (notas > 0) {
            println("$notas Cédulas de R$50")
        }
        valorSaque = valorSaque - (50 * notas)
        notas = valorSaque / 10
        if (notas > 0) {
            println("$notas Cédulas de R$10")
        }
        valorSaque = valorSaque - (10 * notas)
        notas = valorSaque / 5
        if (notas > 0) {
            println("$notas Cédulas de R$5")
        }
        valorSaque = valorSaque - (5 * notas)
        if (valorSaque > 0) {
            println("$valorSaque Cédulas de R$1")
        }
    }
}

fun exercicio3_2() {
    var resposta = ""
    var soma = 0
    println("Telefonou para a vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s") {
        soma++
    }
    resposta = ""
    println("Esteve no local do crime?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s") {
        soma++
    }
    resposta = ""
    println("Mora perto da vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s") {
        soma++
    }
    resposta = ""
    println("Devia para a vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s") {
        soma++
    }
    resposta = ""
    println("Já trabalhou com a vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s") {
        soma++
    }
    when {
        soma == 5 -> {
            println("Assassino")
        }
        soma >= 3 -> {
            println("Cúmplice")
        }
        soma == 2 -> {
            println("Suspeito")
        }
        else -> {
            println("Inocente")
        }
    }
}