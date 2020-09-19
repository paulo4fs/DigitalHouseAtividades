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

    fun procurarconta(numeroConta: Int): ContaBancaria? {
        for (conta in contas) {
            if (conta.numero == numeroConta) {
                return conta
            }
        }
        return null
    }

    override fun mostrarDados() {
        for (i in contas) {
            i.mostrarDados()
        }
    }
}