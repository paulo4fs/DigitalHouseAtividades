class ContaPoupanca(numero: Int, saldo: Double, private val limite: Double) : ContaBancaria(numero, saldo), Imprimivel {
    override fun sacar(valor: Double): Boolean {
        if ((saldo + limite) >= valor) {
            saldo -= valor
            println("novo saldo $saldo")
            return true
        } else {
            println("saldo insuficiente")
            return false
        }
    }
    override fun depositar(valor: Double): Boolean {
        saldo += (valor)
        println("novo saldo $saldo")
        return true
    }
    override fun mostrarDados() {
        println("Conta Poupança $numero.\nSaldo: $saldo, Limite: $limite")
    }
}