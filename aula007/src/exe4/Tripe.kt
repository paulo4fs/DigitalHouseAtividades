package exe4

class Tripe(var dobrado: Boolean, var alturaMinima: Double, var alturaMaxima: Double,
            var alturaAtual: Double) {
    fun definirAltura(novaAltura: Double) {
        alturaAtual = novaAltura
    }

    fun dobrar() {
        if (!dobrado) {
            dobrado = true
        }
        println("dobrei")
    }

    fun desdobrar() {
        if (dobrado) {
            dobrado = false
        }
        println("desdobrei")
    }

    fun guardar() {
        if (!dobrado) {
            dobrado = true
        }
        alturaAtual = alturaMinima
        println("guardei")

    }

    fun prontoParaGuardar(): Boolean {
        if (dobrado && alturaAtual == alturaMinima) {
            println("pronto pra guardar")
            return true
        }
        println("não tá pronto pra guardar")
        return false

    }

    fun usar() {
        if (!dobrado) {
            dobrado = true
        }
        alturaAtual = (alturaMaxima / 2)
        println("usando")
    }

    fun prontoParaUsar(): Boolean {
        if (dobrado && alturaAtual > (alturaMaxima / 2)) {
            println("pronto pra usar")
            return true
        }
        println("não tá pronto pra usar")
        return false
    }
}