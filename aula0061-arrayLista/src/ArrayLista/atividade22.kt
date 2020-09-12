fun main(){
    println("Qual o valor do saque?")
    var saque = 0
    do{
        saque = readLine()!!.toInt()
    }while(saque<10 || saque>600)
    val meuArray = Array(5){_ ->0}
    val notasArray = arrayOf<Int>(100,50,10,5,1)
    for(index in 0..4){
        if(saque % notasArray[index] >= 0){
            meuArray[index] = (saque/notasArray[index])
            saque %= notasArray[index]
        }
    }
    println("${meuArray[0]} nota(s) de 100, ${meuArray[1]} nota(s) de 50, ${meuArray[2]} nota(s) de 10, ${meuArray[3]} nota(s) de 5, ${meuArray[4]} nota(s) de 1")
}

/*fun main() {
    println("Qual o valor do saque?")

    var saque = 0

    do{
         saque = readLine()!!.toInt()
    }while(saque<10 || saque>600)

    val meuArray = Array(5){_ ->0}
    while (saque>0) {
        while(saque>=100){
            saque-=100
            meuArray[4]++
        }
        while(saque>=50){
            saque-=50
            meuArray[3]++
        }
        while(saque>=10){
            saque-=10
            meuArray[2]++
        }
        while(saque>=5){
            saque-=5
            meuArray[1]++
        }
        while(saque>=1){
            saque-=1
            meuArray[0]++
        }
    }

    println("serão fornecidas:")
    println("${meuArray[4]} nota(s) de 100, ${meuArray[3]} nota(s) de 50, ${meuArray[2]} nota(s) de 10, ${meuArray[1]} nota(s) de 5, ${meuArray[0]} nota(s) de 1")
}*/