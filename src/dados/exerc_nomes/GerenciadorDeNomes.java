package dados.exerc_nomes;

import dados.exerc_hashmap.GerenciadorDeEstoque;

import java.util.HashSet;
import java.util.Scanner;

public class GerenciadorDeNomes {

    private HashSet<String> hashNomes;

    public GerenciadorDeNomes() {
        this.hashNomes = new HashSet<>();
    }

    public String adicionarNome(final String nome) {
        if (hashNomes.add(nome)) {
            return "Nome adicionado na Lista";
        }else {
            return "Nome duplicado! Impossivel adiciona-lo";
        }
    }

    public boolean existeNome(final String nome) {
        return hashNomes.contains(nome);
    }

    public String removerNome(final String nome) {
        if (hashNomes.remove(nome)) {
            return "Nome removido da lista";
        }else {
            return "Nome não encontrado na lista";
        }
    }

    public void exibirTodosNomes() {
        if (hashNomes.isEmpty()) {
            System.out.println("Lista de nomes vazia!");
        }else {
            for (String nome : hashNomes) {
                System.out.println("Nome: "+nome);
            }
        }
    }

    public void run() {
        boolean sair = true;
        while (sair) {
            System.out.println("==== Estoque ====");
            System.out.println("1- Adicionar Nome");
            System.out.println("2- Verificar Nome");
            System.out.println("3- Remover nomes");
            System.out.println("4- Exibir todos os Nomes");
            System.out.println("5- Sair");
            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();
            entrada.nextLine();

            switch (num) {
                case 1: {
                    System.out.println("Digite o nome do Produto: ");
                    String addNome = entrada.nextLine();
                    adicionarNome(addNome);
                    break;
                }
                case 2: {
                    System.out.println("Verificar Nome: ");
                    String nome = entrada.nextLine();
                    existeNome(nome);
                    break;
                }
                case 3: {
                    System.out.println("Digite o nome para remover: ");
                    String rmNome = entrada.nextLine();
                    removerNome(rmNome);
                    break;
                }
                case 4: {
                    exibirTodosNomes();
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
        GerenciadorDeNomes gerenciadorDeNomes = new GerenciadorDeNomes();
        gerenciadorDeNomes.run();

    }
}
