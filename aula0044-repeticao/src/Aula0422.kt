fun main() {
    var quantidade = 1
    var preco = 0.0
    var total = 0.0
    var contador = 0
    println("digite a quantidade CDs: ")
    quantidade = readLine()!!.toInt()
    for(i in 1..quantidade){
        println("digite o preco do CD: ")
        preco= readLine()!!.toDouble()
        total+=preco
        contador++
    }
    println("O valor total investido é $total")
    println("O valor médio por CD é ${total/contador}")
}