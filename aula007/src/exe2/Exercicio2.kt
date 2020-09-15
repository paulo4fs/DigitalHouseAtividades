package exe2


fun main() {
    var jogador1: JogadorDeFutebol = JogadorDeFutebol("Zezin", 10,
            50, 0, 100)
    var jogador2: JogadorDeFutebol = JogadorDeFutebol("Zezao", 50,
            10, 20, 10)
    SessaoDeTreinamento(5).treinarA(jogador1)
    SessaoDeTreinamento (5).treinarA(jogador2)
}
