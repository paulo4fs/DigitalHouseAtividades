package exe1

class Conta(var numConta: Int, var saldo: Double,
            val titular: Cliente) {

    fun depositar(valor:Double){
        saldo+=valor
        println("- deposito, novo saldo ${saldo}")
    }

    fun sacar(valor:Double){
        if(valor>saldo){
            println("saldo insuficiente")
        }else{
            saldo-=valor
            println("- saque, novo saldo ${saldo}")
        }
    }
}