package dados.prioridade;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] agrs) {

        // Definir prioridade:

        PriorityQueue<Tarefa> filaTarefa = new PriorityQueue<Tarefa>();
        filaTarefa.add(new Tarefa("Responder emails", 3));
        filaTarefa.add(new Tarefa("Corrigir Bugs", 1));
        filaTarefa.add(new Tarefa("Planejamento de Sprint", 2));

        System.out.println("Tarefas por ordem de prioridade: ");
        while (!filaTarefa.isEmpty()) {
            System.out.println(filaTarefa.poll());
        }

        /// /////////////////////////////////
        // Fila: o primeiro elemento que entra é o primeiro a sair.

        Queue<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Maria");
        fila.add("Carlos");

        System.out.println("Fila: " + fila);

        System.out.println("Primeiro da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " + fila.poll());
        }
    }
}
