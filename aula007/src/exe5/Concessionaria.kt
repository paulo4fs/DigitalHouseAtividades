package exe5

class Concessionaria(val veiculo: Veiculo,val cliente: Cliente,
                     val valor: Double) {
    fun registrarVenda(){
        Venda(valor,veiculo,cliente)
        println("vendido o ${veiculo.marca} ${veiculo.modelo} para ${cliente.nome} por R\$$valor")
    }
}