package exercicio04

fun main() {
    var ferramenta = Peca1("fiat", "uno")
    var ferramenta2 = Peca1("fiat", "palio")
    var guardaVolumes = GuardaVolumes()
    guardaVolumes.guardarPecas(mutableListOf(ferramenta, ferramenta2))
    guardaVolumes.mostrarPecas()
    ferramenta.retirada("fiat", "uno", guardaVolumes)
}