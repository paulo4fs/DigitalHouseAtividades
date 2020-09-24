package exercicio04

fun main() {
    var ferramenta = Peca1("ruim", "demais")
    var ferramenta2 = Peca1("ruim", "menosRuim")
    var guardaVolumes = GuardaVolumes()
    guardaVolumes.guardarPecas(mutableListOf(ferramenta, ferramenta2))
//    guardaVolumes.mostrarPecas()
//    guardaVolumes.devolverPecas(0)
//    guardaVolumes.guardarPecas(mutableListOf(ferramenta2))
//    guardaVolumes.mostrarPecas()
//    guardaVolumes.devolverPecas(1)
    guardaVolumes.mostrarPecas()
    guardaVolumes.devolverPecas(0)
    guardaVolumes.mostrarPecas()
}