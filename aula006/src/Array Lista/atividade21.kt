fun main() {
    println("Qual o melhor Sistema Operacional para uso em servidores?")
    println("As possíveis respostas são:")
    println("1- Windows Server")
    println("2- Unix")
    println("3- Linux")
    println("4- Netware")
    println("5- Mac OS")
    println("6- Outro")

    val meuArray = arrayOf<Float>(0f, 0f, 0f, 0f, 0f, 0f)
    val sistemas = arrayOf("Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro")
    var voto = 0
    var totalVotos = 0
    while (true) {
        println("Qual o seu voto? (pra sair digite 0)")
        voto = readLine()!!.toInt()
        if (voto == 0) {
            break
        } else if (voto < 0 || voto > 6) {
            println("Atenção o voto tem que ser entre 1 e 6")
        } else {
            meuArray[voto - 1]++
            totalVotos++
        }
    }
    // "%.2f".format(valor)
    var index = 0
    var max = 0f
    for (i in 0..5) {
        if (meuArray[i] > max) {
            index = i
        }
    }
    println("Sistema Operacional Votos %")
    println("------------------- ----- ---")
    println("Windows Server ${meuArray[0]} " + "%.2f".format((meuArray[0] / totalVotos) * 100) + "%")
    println("Unix           ${meuArray[1]} " + "%.2f".format((meuArray[1] / totalVotos) * 100) + "%")
    println("Linux          ${meuArray[2]} " + "%.2f".format((meuArray[2] / totalVotos) * 100) + "%")
    println("Netware        ${meuArray[3]} " + "%.2f".format((meuArray[3] / totalVotos) * 100) + "%")
    println("Mac OS         ${meuArray[4]} " + "%.2f".format((meuArray[4] / totalVotos) * 100) + "%")
    println("Outro          ${meuArray[5]} " + "%.2f".format((meuArray[5] / totalVotos) * 100) + "%")
    println("------------------- ----")
    println("Total          $totalVotos")
    println("O Sistema Operacional mais votado foi o ${sistemas[index]}, com ${meuArray[index]} votos, correspondendo a " + "%.2f".format((meuArray[5] / totalVotos) * 100) + "% dos votos.")
}