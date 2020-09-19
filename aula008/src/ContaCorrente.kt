class ContaCorrente(numero: Int, saldo: Double, private val taxaDeOperacao: Double) : ContaBancaria(numero, saldo),
    Imprimivel {
    var limite: Double = 200.00
    override fun sacar(valor: Double): Boolean {
        if ((valor + taxaDeOperacao) <= saldo) {
            saldo -= (valor + taxaDeOperacao)
            println("novo saldo $saldo")
            return true
        } else {
            println("saldo insuficiente")
            return false

        }
    }

    override fun depositar(valor: Double): Boolean {
        if ((valor + saldo) >= taxaDeOperacao) {
            saldo += (valor - taxaDeOperacao)
            println("novo saldo $saldo")
            return true
        } else {
            return false
        }
    }

    override fun mostrarDados() {
        println("Conta Corrente $numero.\nSaldo: $saldo, Taxa de operacao: $taxaDeOperacao")
    }

}