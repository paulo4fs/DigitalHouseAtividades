package exe2

class SessaoDeTreinamento (var experiencia: Int){
    fun treinarA(jogador:JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("\nexperiência inicial de ${jogador.nome}: ${jogador.experiencia}")
        jogador.experiencia+=5
        println("\nexperiência final de ${jogador.nome}: ${jogador.experiencia}")
    }
}