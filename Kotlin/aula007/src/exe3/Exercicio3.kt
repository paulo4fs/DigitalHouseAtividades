package exe3

fun main(){
    var atleta1:Atleta = Atleta("Zezin",30,50)
    var atleta2:Atleta = Atleta("Zezao",60,100)

    Prova(60,10).podeRealizar(atleta1)
    Prova(20,50).podeRealizar(atleta2)
}