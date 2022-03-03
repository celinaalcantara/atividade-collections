fun main() {
    //Exercício com Collection

    /* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.*/


    val estoque = mutableListOf<String>()

    while (true) {

        println(".....................")
        println(" Controle de Estoque\n")
        println("1 para adicionar itens no estoque")
        println("2 para remover itens do estoque")
        println("3 para atualizar itens do estoque")
        println("4 para listar itens do estoque")
        println("5 para sair")

        println("\nSelecione uma opção (1 a 5): ")
        val opcao = readLine()!!.toInt()


        when (opcao) {

            1 -> {
                println("Item a ser adicionado no estoque: ")
                val item = readLine()!!

                if (item.isEmpty()) {
                    println("Opção inválida.")
                } else {
                    estoque.add(item)
                    println("O item $item foi adicionado ao estoque.")
                }
            }

            2 -> {
                println("Digite item a ser removido: ")
                val item = readLine()!!

                if (item.isEmpty()) {
                    println("Opção inválida.")
                } else {
                    if (estoque.contains(item)) {
                        estoque.remove(item)
                        println("O item $item foi removido do estoque.")
                    } else {
                        println("Item não encontrado.")
                    }
                }
            }

            3 -> {
                print("\nDigite o produto que será atualizado: ")
                val item = readLine()!!

                if (item.isEmpty()) {
                    println("Valor inválido")
                } else {

                    if (estoque.contains(item)) {

                        val pItem = estoque.indexOf(item)

                        println("Digite novo item: ")
                        val itemNovo = readLine()!!

                        if (itemNovo.isEmpty()) {
                            println("Opção inválida")
                        } else {
                            estoque[pItem] = itemNovo
                            println("Estoque atualizado.")
                        }

                    } else {
                        println("Item $item não encontrado.")
                    }
                }
            }

            4 -> {
                if (estoque.isEmpty()) {
                    println("Estoque vazio.")
                } else {
                    println("Itens do Estoque: ")

                    estoque.forEach {
                        println(it)

                    }
                }
            }

            else -> break
        }
    }
}
