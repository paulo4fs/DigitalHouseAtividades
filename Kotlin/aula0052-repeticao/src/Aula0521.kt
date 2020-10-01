fun main() {
    var contador = 0
    var soma = 0.0
    var nota = 0.0
    do{
        println("digite sua nota")
        println("digite um valor negativo para sair")
        nota = readLine()!!.toDouble()
        if(nota<0){
            break
        }
        soma+=nota
        contador++
    }while(true)
    println("A média aritmética de $contador nota(s) é ${soma/contador}")
}