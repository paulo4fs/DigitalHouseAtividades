fun main() {
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