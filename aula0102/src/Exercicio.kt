fun main(){
    var list = ArrayList<Item>()
    list.add(Item(1,"pedra",-1,-1.00))
    list.add(Item(2,"papel",1,1.10))
    list.add(Item(3,"tesoura",1,2.05))
    list.add(Item(4,"pedra",3,3.10))
    list.add(Item(5,"papel",3,2.20))
    list.add(Item(6,"tesoura",3,5.0))
    var fatura =Fatura(list)
    fatura.getTotalFatura()
}