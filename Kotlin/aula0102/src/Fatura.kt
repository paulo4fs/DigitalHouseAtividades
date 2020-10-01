class Fatura() {
    fun getTotalFatura(lista: ArrayList<Item>): Double {
        var total: Double = 0.00
        for (item in lista) {
            total += (item.preco * item.quantidade)
        }
        println("O total foi: $total")
        return total
    }
}