package exe5

fun main() {
    var cliente1: Cliente = Cliente("Paulo", "Silva",
            "123123123")
    var veiculo1: Veiculo = Veiculo("BMW", "Z", 2000,
            "branco", 10000)
    Concessionaria(veiculo1, cliente1, 10000.0).registrarVenda()
}
