package dados;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Romanos {

    public static void main(String[] args) {

        System.out.println(conversao2(3749));

    }

    public static String converter(int num) {

        Map<String, Integer> romanos = new HashMap<>();
        romanos.put("M", 1000);
        romanos.put("CM", 900);
        romanos.put("D", 500);
        romanos.put("CD", 400);
        romanos.put("C", 100);
        romanos.put("XC", 90);
        romanos.put("L", 50);
        romanos.put("XL", 40);
        romanos.put("X", 10);
        romanos.put("IX", 9);
        romanos.put("V", 5);
        romanos.put("IV", 4);
        romanos.put("I", 1);

        Stack<String> pilha = new Stack<>();
        pilha.push("I");
        pilha.push("IV");
        pilha.push("V");
        pilha.push("IX");
        pilha.push("X");
        pilha.push("XL");
        pilha.push("L");
        pilha.push("XC");
        pilha.push("C");
        pilha.push("CD");
        pilha.push("D");
        pilha.push("CM");
        pilha.push("M");

        StringBuilder resultado = new StringBuilder();

        while (!pilha.isEmpty()) {
            int val = romanos.get(pilha.peek());

            if (num - val >= 0) {
                System.out.println(num +" - "+val+" = "+ (num - val));
                num -= val;
                resultado.append(pilha.peek());
            } else {
                pilha.pop();
            }

        }

        return resultado.toString();
    }

    public static String conversao2(int num) {

        String[] simbolos = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder resultado = new StringBuilder();

        for (int x = 0; x <= simbolos.length - 1; x++) {
            int val = values[x];
            while (num - val >= 0) {
                num -= val;
                resultado.append(simbolos[x]);
            }
        }
        return resultado.toString();
    }

}
