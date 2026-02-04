package generics.bolsa_ninja.src.entities;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // inicializar o array
    private List<T> ferramentas = new ArrayList<>();

    // construtor
//    public BolsaNinja() {
//        this.ferramentas = new ArrayList<>();
//    }

    // colocar ferramentas na lista
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // mostrar a lista de ferramentas
    public void mostrarFerramentas() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }

}
