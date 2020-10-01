package exercicio04

class Peca1(marca: String, modelo: String) : Peca(marca, modelo), Pertence {
    override fun retirada(
        marcaPeca: String,
        modeloPeca: String,
        guardaVolumes: GuardaVolumes
    ) {

        for (chave in guardaVolumes.chave) {
            for (valor in chave.value) {
                if (valor.marca == marcaPeca && valor.modelo == modeloPeca) {
                    println("#############")
                    println("A chave procurada é: ${chave.key}")
                    guardaVolumes.devolverPecas(chave.key)
                    break
                }
            }
        }
    }
}