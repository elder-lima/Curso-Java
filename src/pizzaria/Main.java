package pizzaria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> cardapio = new ArrayList<>();

        Pizza p1 = new Pizza("Calabresa", BigDecimal.valueOf(50));
        Pizza p2 = new Pizza("Mussarela", BigDecimal.valueOf(55));
        Pizza p3 = new Pizza("Portuguesa", BigDecimal.valueOf(45));
        Pizza p4 = new Pizza("Frango", BigDecimal.valueOf(35));

        cardapio.addAll(Arrays.asList(p1,p2,p3,p4));

        cardapio.forEach(System.out::println);

        System.out.println("=====================");

        cardapio.stream().filter(x -> x.getPreco().compareTo(BigDecimal.valueOf(50)) < 0).forEach(System.out::println);
       //cardapio.forEach(System.out::println);
    }
}
