fun main(){
    // 1
    println("- atividade 4")
    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()
    if(peso>50){
        println("Excedeu ${peso-50}")
        var multa : Double = (peso-50)*4
        println("O valor a ser pago é de R\$${multa}")
    }
}