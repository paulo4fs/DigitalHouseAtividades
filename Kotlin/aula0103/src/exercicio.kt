fun main(){

    var estoque = Estoque("coisas",30,10)
    estoque.mudarNome("coisass")
    println(estoque.mostra())
    estoque.mudarQtdMinima(5)
    println(estoque.mostra())
    estoque.darBaixa(10)
    println(estoque.mostra())
    println("precisa repor? ${estoque.precisaRepor()}")
    estoque.repor(10)
    println(estoque.mostra())
    println("precisa repor? ${estoque.precisaRepor()}")
    estoque.darBaixa(30)
    println(estoque.mostra())
    println("precisa repor? ${estoque.precisaRepor()}")
}