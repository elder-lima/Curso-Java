package dados;

import java.util.Stack;

public class BalanceadorParenteses {

    public static boolean estabalanceado(String expressao) {

        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            }
            else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {

        String[] expressoes = {
                "(a+b)",
                "((a+b) *c)",
                "(a+b"
        };

        for (String exp : expressoes) {
            boolean resultado = estabalanceado(exp);
            System.out.println("Expressão: "+ resultado);
        }

    }
}
