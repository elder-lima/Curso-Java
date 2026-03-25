package exerc_leet;

import java.util.List;

public class Reduzir {
    public static void main(String[] args) {

        List<String> nomes = List.of("A","B","C");

        String nome = nomes.stream().reduce("", (a, b) -> a + b);

        System.out.println(nome);

    }
}
