package exercicio04

class Peca1(marca: String, modelo: String) : Peca(marca, modelo), Pertence {
    override fun retirada(numero: Int) {
//        var suaMarca = readLine()!!.toString()
//        var seuModelo = readLine()!!.toString()
//        if (suaMarca == marca && seuModelo == modelo) {
//            GuardaVolumes().devolverPecas()
//        }
        GuardaVolumes().devolverPecas(numero)
    }
}