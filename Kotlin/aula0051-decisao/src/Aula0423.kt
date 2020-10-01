fun main() {
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