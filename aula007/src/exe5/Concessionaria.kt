package exe5

class Concessionaria {
    val registroDeVendas = ArrayList<Venda>()
    fun registrarVenda(veiculo: Veiculo,cliente: Cliente, valor: Double){
        var novaVenda = Venda(valor,veiculo,cliente)
        registroDeVendas.add(novaVenda)
        println("quantidade de vendas registradas: ${registroDeVendas.size}")
    }
}