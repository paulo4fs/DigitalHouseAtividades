fun main(){
    val meuArray = arrayListOf<Double>()
    var altura = 0.0
    for(i in 1..5){
        print("digite sua altura: ")
        altura = readLine()!!.toDouble()
        meuArray.add(altura)
    }
    meuArray.reverse()
    println(meuArray)
}