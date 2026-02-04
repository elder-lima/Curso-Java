package ExerciciosLeet.vetores;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubStrings {

    public static void main(String[] args) {

        SubStrings sub = new SubStrings();
        System.out.println(sub.maiorSubString("abcdefgayuiopkqabb"));

    }

    public int maiorSubString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int esquerda = 0;
        int max = 0;

        for (int direita = 0; direita < s.length(); direita++) {

            char atual = s.charAt(direita);

            if (map.containsKey(atual)) {
                esquerda = Math.max(esquerda, map.get(atual) + 1);
            }

            map.put(atual, direita);
            max = Math.max(max, direita - esquerda + 1);
        }

        return max;
    }

}
