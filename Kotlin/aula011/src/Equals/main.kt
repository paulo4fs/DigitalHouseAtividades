package Equals

fun main() {
//    var pessoa1 = Equals.Pessoa("zézin", 18031803)
//    var pessoa2 = Equals.Pessoa("zé", 18031803)
    // 3-são diferentes pois os nome foi considerado no equals
    // 5-são iguais porque só se leva em consideração o RG que é igual
    // println(pessoa1.equals(pessoa2))

//    var coca1 = Equals.Coca(500, 3.00)
//    var coca2 = Equals.Coca(500, 3.50)
    // println(coca1 == coca2)
    // 3-são diferentes pois o preço é diferente
    // 5-são iguais porque só se leva em consideração o tamanho

//    var aluno1 = Equals.Aluno("zé", 111)
//    var aluno2 = Equals.Aluno("zée", 112)
//    var aluno3 = Equals.Aluno("zéee", 113)
//    var aluno4 = Equals.Aluno("zéeee", 114)
//    var alunos = ArrayList<Equals.Aluno>()
//    alunos.add(aluno1)
//    alunos.add(aluno2)
//    alunos.add(aluno3)
//    alunos.add(aluno4)
//
//    var aluno5 = Equals.Aluno("zéeeee", 111)
//    println(alunos.contains(aluno5))
    //3-ele não aceita
    //5-ele diz que está incluso, pois possivelmente uso o equals para fazer a comparação
    var funcionarios = ArrayList<Funcionario>()
    var funcionario1 = Funcionario("zé", 111)
    var funcionario2 = Funcionario("zé", 112)
    var funcionario3 = Funcionario("zé", 113)
    var funcionario4 = Funcionario("zé", 114)
    var funcionario5 = Funcionario("zéééé", 111)

    funcionarios.add(funcionario1)
    funcionarios.add(funcionario2)
    funcionarios.add(funcionario3)
    funcionarios.add(funcionario4)

    println(funcionarios.contains(funcionario5))
    //3-ele não diz que não contém pois o nome é diferente
    //5-ele diz que está contido pois o número de registro é igual

}