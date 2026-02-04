package ExerciciosLeet.vetores;

import java.util.*;
import java.util.stream.Collectors;

public class Temperaturas {

    public static void main(String[] args) {

        int[] temperaturas = new int[]{73,74,80,71,69,85,76,77};
        // Saida:                      1   1  0  2  1  0  1  0
    }

    public static int[] temperaturasDiarias(int[] temperaturas) {
        int n = temperaturas.length;
        int[] resposta = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperaturas[i] > temperaturas[stack.peek()]) {
                int indice = stack.pop();
                resposta[indice] = i - indice;
            }
            stack.push(i);
        }

        return resposta;
    }

}
