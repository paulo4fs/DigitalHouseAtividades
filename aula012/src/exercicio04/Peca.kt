package exercicio04

abstract class Peca(
    var marca: String,
    var modelo: String
) : Pertence {
    override fun retirada(
        marca: String,
        modelo: String,
        guardaVolumes: GuardaVolumes
    ) {
    }

}