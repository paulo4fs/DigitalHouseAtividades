fun main() {
/*
    var contacorrente1 = ContaCorrente(1, 100.0, 3.50)
    var contacorrente2 = ContaCorrente(2, 100.0, 3.50)
    var contapoupanca1 = ContaPoupanca(3, 100.0, 200.0)
    var contapoupanca2 = ContaPoupanca(4, 100.0, 200.0)

    contacorrente1.sacar(50.00)
    contacorrente2.sacar(50.00)
    contapoupanca1.sacar(300.00)
    contapoupanca2.sacar(500.00)

    contacorrente1.transferir(10.00, contacorrente1, contapoupanca2)

    val relatorio = Relatorio()

    relatorio.gerarRelatorio(contacorrente1)
    relatorio.gerarRelatorio(contacorrente2)
    relatorio.gerarRelatorio(contapoupanca1)
    relatorio.gerarRelatorio(contapoupanca2)
*/
    var banco = Banco()

    while (true) {
        when (menuPrincipal()) {
            1 -> criarConta(banco, banco.contas.size)
            2 -> acessoContas(banco)
            3 -> excluir(banco)
            4 -> relatorioGeral(banco)
            5 -> {
                println("Aplicação finalizada")
                break
            }
            else -> println("Não entendi, digite novamente.")
        }
    }
}

fun menuPrincipal(): Int {
    println("#######################")
    println("1 - Criar conta.")
    println("2 - Selecionar conta.")
    println("3 - Remover conta.")
    println("4 - Gerar relatório.")
    println("5 - finalizar.")
    println("Digite o numero da opção que deseja acessar:")
    return readLine()!!.toInt()
}

fun criarConta(banco: Banco, size: Int) {
    println(
        "Para criar uma conta corrente digite \"1\" para conta poupanca digite \"2\":"
    )
    var digito = readLine()!!.toInt()
    while (true) {
        when (digito) {
            1 -> {
                var novaConta = ContaCorrente(size, 0.00, 5.00)
                banco.inserir(novaConta)
                println("Conta corrente criada")
                break
            }
            2 -> {
                var novaConta = ContaCorrente(size, 0.00, 5.00)
                banco.inserir(novaConta)
                println("Conta poupança criada")
                break
            }
            else -> {
                println("valor não existente.")
            }
        }
    }
}

fun acessoContas(banco: Banco) {
    println("Digite o numero da conta que deseja acessar:")
    var digito = readLine()!!.toInt()
    println("#######################")
    if (banco.procurarconta(digito) is ContaBancaria) {
        subMenu()
        var opcao = readLine()!!.toInt()
        println("#######################")
        when (opcao) {
            1 -> {
                val valor = deposito()
                banco.contas[digito].depositar(valor)
            }
            2 -> {
                var valor = saque()
                banco.contas[digito].depositar(valor)
            }
            3 -> {
                transferencia(banco, digito)
            }
            4 -> {
                relatorio(banco, digito)
            }
            else -> {
                println("voltando para o menu")
            }
        }
    } else {
        println("conta não encontrada")
    }
}

fun subMenu() {
    println("1 - Depositar.")
    println("2 - Sacar.")
    println("3 - Transferir.")
    println("4 - Mostrar dados.")
    println("5 - Retornar ao menu inicial.")
    println("Digite o numero da opção que deseja acessar:")
}

fun excluir(banco: Banco) {
    println("digite o numero da conta a ser excluída:")
    var digito = readLine()!!.toInt()
    if (banco.procurarconta(digito) is ContaBancaria) {
        println("A conta ${banco.contas[digito].numero} será excluída.")
        banco.remover(banco.contas[digito])
    } else {
        println("conta não encontrada")
    }
}

fun deposito(): Double {
    println("DEPÓSITO")
    println("Digite o valor do deposito:")
    return readLine()!!.toDouble()
}

fun saque(): Double {
    println("\nSAQUE")
    println("Digite o valor para sacar:")
    return readLine()!!.toDouble()
}

fun transferencia(banco: Banco, digito: Int): Banco {
    println("\nTRANSFERÊNCIA")
    println("Digite o valor para transferir:")
    var valor = readLine()!!.toDouble()
    println("Digite a conta que deseja enviar a transferência:")
    var numConta = readLine()!!.toInt()
    if (banco.procurarconta(numConta) is ContaBancaria) {
        banco.contas[digito].transferir(valor, banco.contas[digito], banco.contas[numConta])
    } else {
        println("conta não encontrada")
    }
    return banco
}

fun relatorio(banco: Banco, digito: Int) {
    println("\nRELATÓRIO")
    var minhaConta = banco.contas[digito]
    minhaConta.mostrarDados()
}

fun relatorioGeral(banco: Banco) {
    println("Relatório de todas as contas:")
    banco.mostrarDados()
}