package exe3

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean {
        if (atleta.nivel >= this.dificuldade
                && atleta.energia>=energiaNecessaria) {
            println("parabens")
            return true
        }
        println("faio")
        return false
    }
}