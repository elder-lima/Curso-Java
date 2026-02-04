package jokempo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

    public static void main(String[] args) {

        Jokempo jokempo = new Jokempo();
        jokempo.runGame();

    }

    public void runGame() {

        Scanner jogada = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("=========== Jokempo =============");
            System.out.println("1- PEDRA");
            System.out.println("2- PAPEL");
            System.out.println("3- TESOURA");
            System.out.println("4- SAIR");

            int numero = jogada.nextInt();

            if (numero == 4) {
                System.out.println("Saindo do jogo...");
                break;
            }

            if (numero > 4 || numero < 1) {
                System.out.println("Opção Inválida! Digite Corretamente!!");
                continue;
            }

            Gesto gestoJogador1 = switch (numero) {
                case 1 -> Gesto.PEDRA;
                case 2 -> Gesto.PAPEL;
                default -> Gesto.TESOURA;
            };

            Gesto[] valores = Gesto.values();
            Gesto gestoJogador2 = valores[random.nextInt(valores.length)];

            Jogador jogador1 = new Jogador("Jogador1", gestoJogador1);
            Jogador jogador2 = new Jogador("Jogador2", gestoJogador2);

            System.out.println(jogador1.nome + " Gesto: "+ jogador1.gesto);
            System.out.println(jogador2.nome + " Gesto: "+ jogador2.gesto);

            Game(jogador1, jogador2);

        }

    }

    public void Game(Jogador jogador1, Jogador jogador2) {

        if (jogador1.gesto == jogador2.gesto) {
            System.out.println("EMPATE!");
        }

        if (jogador1.gesto.vence(jogador2.gesto)) {
            System.out.println(jogador1.nome + " Venceu!");
        }else {
            System.out.println(jogador2.nome + " Venceu!");
        }

    }


}
