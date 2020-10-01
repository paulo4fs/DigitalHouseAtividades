package exe4B

class Carro(var consumo: Double, var combustivel: Double) {
    fun andar(distancia: Double) {
        if (distancia > (consumo * combustivel)) {
            println("A distancia máxima é ${consumo * combustivel}")
        } else {
            println("anda $distancia quilômetros.")
            combustivel-=distancia*consumo
        }
    }

    fun obterGasolina() {
        println("$combustivel litros no tanque")
    }

    fun adicionarGasolina(novoCombustivel: Boolean) {
        println("abastece com $novoCombustivel litros de combustível.")
    }
}