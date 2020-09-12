package funcao

import kotlin.random.Random

fun main() {
    var count = 0
    var ponto = 0
    while (true) {

        var dado = rolarDados()
        if(dado==0){
            break
        }
        if (count == 0 && (dado == 7 || dado == 11)) {
            println("Parabéns você tirou $dado, você ganhou!!")
            break
        } else if (count == 0 && (dado == 2 || dado == 3 || dado == 12)) {
            println("Você tirou $dado, você perdeu")
            break
        } else if (count == 0) {
            ponto = dado
            println("Você tirou $ponto! você precisa tirar esse valor novamente")
        } else if (dado == 7) {
            println("Você tirou $dado, você perdeu")
            break
        } else if (ponto == dado) {
            println("Parabéns você tirou $dado duas vezes, você ganhou!!")
            break
        }else{
            println("Você tirou $dado, role de novo.")
        }
        count++
    }
}

fun rolarDados(): Int {
    println("Rolar dados (s ou n)?")
    var rolarDado = readLine()!!.toLowerCase()
    if (rolarDado == "n") {
        return 0
    } else {
        return Random.nextInt(2, 12)
    }
}