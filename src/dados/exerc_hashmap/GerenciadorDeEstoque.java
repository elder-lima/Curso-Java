package dados.exerc_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeEstoque {

    private HashMap<String, Integer> listaEstoque;

    public GerenciadorDeEstoque() {
        this.listaEstoque = new HashMap<>();
    }

    public String adicionarOuAtualizar(final String produto, final int quantidade) {

        if (quantidade <= 0) {
            return "Quantidade Inválida!";
        }

        if (listaEstoque.containsKey(produto)) {
            listaEstoque.put(produto, listaEstoque.get(produto) + quantidade);
            return "Produto "+produto+" atualizado com sucesso.";
        } else {
            listaEstoque.put(produto, quantidade);
            return "Produto adicionado ao estoque.";
        }
    }

    public String removerProduto(final String produto) {
        if (listaEstoque.remove(produto) != null) {
            return "Produto "+produto+" foi removido!";
        } else {
            return "Produto não foi encontrado!";
        }
    }

    public void exibirTodosProdutos() {
        for (Map.Entry<String, Integer> entry : listaEstoque.entrySet()) {
            System.out.println("Produto: "+entry.getKey()+" Quantidade: "+entry.getValue());
        }
    }

    public void consultarProduto(final String produto) {
        if (listaEstoque.containsKey(produto)) {
            Integer qtdProduto = listaEstoque.get(produto);
            System.out.println("Produto "+produto+" Quantidade: "+qtdProduto);
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void run() {
        boolean sair = true;
        while (sair) {
            System.out.println("==== Estoque ====");
            System.out.println("1- Adicionar ou Atualizar Produto");
            System.out.println("2- Remover Produto");
            System.out.println("3- Exibir todos os Produtos");
            System.out.println("4- Consultar Produto");
            System.out.println("5- Sair");
            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();
            entrada.nextLine();

            switch (num) {
                case 1: {
                    System.out.println("Digite o nome do Produto: ");
                    String addProduto = entrada.nextLine();
                    System.out.println("Digite a quantidade: ");
                    int qtd = entrada.nextInt();
                    adicionarOuAtualizar(addProduto, qtd);
                    break;
                }
                case 2: {
                    System.out.println("Digite o nome do produto:2 ");
                    String rmProduto = entrada.nextLine();
                    removerProduto(rmProduto);
                    break;
                }
                case 3: {
                    exibirTodosProdutos();
                    break;
                }
                case 4: {
                    System.out.println("Digite o nome do produto:3 ");
                    String produtoConsulta = entrada.nextLine();
                    consultarProduto(produtoConsulta);
                    break;
                }
                case 5: {
                    System.out.println("Saindo");
                    sair = false;
                    break;
                }
            }

        }
    }


    public static void main(String[] args) {

        GerenciadorDeEstoque estoque = new GerenciadorDeEstoque();
        estoque.run();

    }
}
