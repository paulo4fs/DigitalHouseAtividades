package exe1

fun main() {
    val cliente1: Cliente = Cliente("Paulo", "Silva")
    val cliente2: Cliente = Cliente("Pauloo", "Silvaa")

    val conta1: Conta = Conta(1, 50.00, cliente1)
    val conta2: Conta = Conta(2, 100.00, cliente2)

    conta1.depositar(50.00)
    conta1.sacar(150.00)
    conta2.depositar(50.00)
    conta2.sacar(150.00)
}