package exerc_leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        String s = "lee(t(c)o)()de)"; // saida: lee(t(c)o)de)
        System.out.println(pilha(s));
    }

public static String pilha(String s) {

    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for (int x = 0; x < s.length(); x++) {

        char c = s.charAt(x);

        if (c == '(') {
            stack.push(c);
            sb.append(c);
        }
        else if (c == ')') {

            if (!stack.isEmpty()) {
                stack.pop();
                sb.append(c);
            }

        } else {
            sb.append(c);
        }
    }

    return sb.toString();
}
}
