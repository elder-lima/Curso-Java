package generics.bolsa_ninja.src.application;

import generics.bolsa_ninja.src.entities.*;

public class Program {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do sapo"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação da aguia"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Mamute"));

        System.out.println("Itens da bolsa ninja: ");
        bolsaNinja.mostrarFerramentas();

        BolsaNinja<Object> bolsa2 = new BolsaNinja<>();
        bolsa2.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsa2.adicionarFerramenta(new Shuriken(3));

        System.out.println("Itens da bolsa ninja: ");
        bolsa2.mostrarFerramentas();

    }
}
