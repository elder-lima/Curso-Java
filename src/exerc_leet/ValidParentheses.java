package exerc_leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {


        String s = "(){{({()})}}{}";

        System.out.println(validParentheses(s));
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int x=0; x < s.length(); x++) {

            char caracter = s.charAt(x);

            if (!stack.isEmpty() && map.get(caracter) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(caracter);
            }
        }

        if (stack.isEmpty()){
            return true;
        }

        return false;
    }

}
