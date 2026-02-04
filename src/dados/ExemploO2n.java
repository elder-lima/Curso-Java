package dados;

public class ExemploO2n {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // 2 chamadas → O(2ⁿ)
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
