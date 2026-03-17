package exerc_leet;

import java.util.HashMap;
import java.util.Map;

public class Exerc3 {
    public static void main(String[] args) {

        String s = "abcabcbb"; // saida: 3
        System.out.println(exerc3(s));

    }
    public static int exerc3(String s) {

        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int esquerda = 0;

        for (int direita=0; direita < s.length(); direita++) {

            Character caracter = s.charAt(direita);

            if (map.containsKey(caracter)) {
                int indice = map.get(caracter);
                esquerda = Math.max(esquerda, indice + 1);
            }

            map.put(caracter, direita);
            max = Math.max(max, direita - esquerda + 1 );

        }

        return max;
    }
}
