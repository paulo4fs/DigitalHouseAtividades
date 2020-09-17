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
        println("#######################")
        println("1 - Criar conta.")
        println("2 - Selecionar conta.")
        println("3 - Remover conta.")
        println("4 - Gerar relatório.")
        println("5 - finalizar.")
        println("Digite o numero da opção que deseja acessar:")
        var num = readLine()!!.toInt()
        println("#######################")
        when (num) {
            1 -> {
                println(
                    "Para criar conta corrente digite \"1\" pra contra poupanca digite \"2\":"
                )
                var digito = readLine()!!.toInt()
                when (digito) {
                    1 -> {
                        var novaCC = ContaCorrente(banco.contas.size, 0.00, 5.00)
                        banco.inserir(novaCC)
                        println("${banco.contas[banco.contas.size - 1] is ContaCorrente}")
                        println(
                            "nova CC criada, com o numero ${banco.contas[banco.contas.size - 1].numero} o banco tem agora ${banco.contas.size} conta(s)"
                        )
                    }
                    2 -> {
                        var novaCP = ContaPoupanca(banco.contas.size, 0.00, 200.00)
                        banco.inserir(novaCP)
                        println(
                            "nova CP criada, com o numero ${banco.contas[banco.contas.size - 1].numero} o banco tem agora ${banco.contas.size} conta(s)"
                        )
                    }
                    else -> {
                        println("valor não existente.")
                    }
                }
            }
            2 -> {

                println("Digite o numero da conta que deseja acessar:")
                var digito = readLine()!!.toInt()
                println("#######################")
                if (digito < banco.contas.size) {
                    println("1 - Depositar.")
                    println("2 - Sacar.")
                    println("3 - Transferir.")
                    println("4 - Mostrar dados.")
                    println("5 - Retornar ao menu inicial.")
                    println("Digite o que deseja fazer:")
                    var opcao = readLine()!!.toInt()
                    println("#######################")

                    when (opcao) {
                        1 -> {
                            println("DEPÓSITO")
                            println("Digite o valor do deposito:")
                            var valor = readLine()!!.toDouble()
                            banco.contas[digito].depositar(valor)
                        }
                        2 -> {
                            println("\nSAQUE")
                            println("Digite o valor para sacar:")
                            var valor = readLine()!!.toDouble()
                            banco.contas[digito].depositar(valor)
                        }
                        3 -> {
                            println("\nTRANSFERÊNCIA")
                            println("Digite o valor para transferir:")
                            var valor = readLine()!!.toDouble()
                            println("Digite a conta que deseja enviar a transferência:")
                            var numConta = readLine()!!.toInt()
                            banco.contas[digito].transferir(valor, banco.contas[digito], banco.contas[numConta])
                        }
                        4 -> {
                            println("\nRELATÓRIO")
                            var minhaConta = banco.contas[digito]
                            minhaConta.mostrarDados()
                        }
                        else -> {
                            println("voltando para o menu")
                        }
                    }
                } else {
                    println("conta não encontrada")
                }
            }
            3 -> {
                println("digite o numero da conta a ser excluída:")
                var digito = readLine()!!.toInt()
                if (digito < banco.contas.size) {
                    println("A conta ${banco.contas[digito].numero} será excluída.")
                    banco.remover(banco.contas[digito])
                } else {
                    println("conta não encontrada")
                }

            }
            4 -> {
                println("Relatório de todas as contas:")
                banco.mostrarDados()
            }
            5 -> {
                println("Aplicação finalizada")
                break
            }
            else -> {
                println("Não entendi, digite novamente.")
            }
        }

    }
}