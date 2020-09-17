class Banco : Imprimivel {
    var contas = ArrayList<ContaBancaria>()
    fun inserir(conta: ContaBancaria) {
        contas.add(conta)
        println("conta adicionada")
    }

    fun remover(conta: ContaBancaria) {
        contas.remove(conta)
        println("conta removida")
    }

    fun procurarconta(numero: Int): ContaBancaria? {
        if (numero in 0 until contas.size) {
            return contas[numero]
        } else {
            return null
        }
    }

    override fun mostrarDados() {
        for (i in contas) {
            println("atributos, número: ${i.numero}, saldo: ${i.saldo}")
        }
    }
}