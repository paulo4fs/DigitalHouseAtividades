abstract class ContaBancaria(val numero: Int, var saldo: Double) :
    Imprimivel {
    abstract fun sacar(valor: Double): Boolean
    abstract fun depositar(valor: Double): Boolean

    fun transferir(valor: Double, conta1: ContaBancaria, conta2: ContaBancaria) {
        val saldoContaOrigem = conta1.saldo
        val saldoContaDestino = conta2.saldo
        if (conta1.sacar(valor) && conta2.depositar(valor)) {
        } else {
            conta1.saldo = saldoContaOrigem
            conta2.saldo = saldoContaDestino
        }
    }
}