class Estoque(var nome: String,
              var qtdAtual: Int,
              var qtdMinima: Int) {
    init{
        qtdAtual=Math.max(0,qtdAtual)
        qtdMinima=Math.max(0,qtdMinima)
    }
    fun mudarNome(nome:String){
        this.nome=nome
    }
    fun mudarQtdMinima(qtdMinima:Int){
        this.qtdMinima = qtdMinima
    }
    fun repor(qtd:Int){
        this.qtdAtual+=qtd
    }
    fun darBaixa(qtd:Int){
        this.qtdAtual-=qtd
    }
    fun mostra():String{
        return "nome: $nome, quantidade atual: $qtdAtual, quantidade mínima: $qtdMinima"
    }
    fun precisaRepor():Boolean{
        return qtdAtual<=qtdMinima
    }
}