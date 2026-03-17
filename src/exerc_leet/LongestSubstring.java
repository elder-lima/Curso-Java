package exerc_leet;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {

        // Entrada: s = "abcabcbb"
        // Saída: 3

        // Entrada: s = "bbbbb"
        // Saída: 1

        // Entrada: s = "pwwkew"
        // Saída: 3

        String s = "pwwkew";
        System.out.println(longestSubstring(s));

    }
    public static int longestSubstring(String s) {

        int maiorSequencia = 0;
        Map<Character, Integer> map = new HashMap<>();
        int esquerda = 0;
        for (int direita=0; direita < s.length(); direita++) {

            Character character = s.charAt(direita);

            if (map.containsKey(character)) {
                esquerda = Math.max(esquerda, map.get(character) + 1);
            }

            map.put(character, direita);
            maiorSequencia = Math.max(maiorSequencia, direita - esquerda + 1);

        }

        return maiorSequencia;
    }
}
