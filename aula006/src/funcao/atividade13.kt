package funcao

fun main(){
    println("digite a taxa:")
    val imposto = readLine()!!.toDouble()/100
    println("digite o custo:")
    val custo = readLine()!!.toDouble()
    println(somaImposto(imposto,custo))
}

fun somaImposto(taxaImposto:Double,custo:Double)= custo + custo*taxaImposto