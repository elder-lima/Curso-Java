package ExerciciosLeet.vetores;

import java.util.HashMap;
import java.util.Map;

public class MaiorComp {

    public static void main(String[] args) {

        String s = "abcdefgayuiopkqabb";
        System.out.println(s.charAt(14));
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int esquerda = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int direita = 0; direita < s.length(); direita++) {

            char valAtual = s.charAt(direita);
            if (map.containsKey(valAtual)) {
                esquerda = Math.max(esquerda, map.get(valAtual) + 1);
            }

            map.put(valAtual, direita);
            max = Math.max(max, direita - esquerda + 1);

        }

        return  max;
    }


}
