package dados;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {

        int[] nums = new int[]{-4,-1,0,3,10,-2}; // 0, 1, 9, 16, 100
        int[] resultado = sortedSquare(nums);
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] sortedSquare(int[] nums) {
        return Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }

    public static int[] sortedSquare2(int[] nums) {

        int n = nums.length;
        int[] resultado = new int[n];

        int esquerda = 0;
        int direita = n - 1;
        int pos = n - 1;

        while (esquerda <= direita) {
            int quadEsq = nums[esquerda] * nums[esquerda];
            int quadDir = nums[direita] * nums[direita];

            if (quadEsq > quadDir) {
                resultado[pos--] = quadEsq;
                esquerda++;
            } else {
                resultado[pos--] = quadDir;
                direita--;
            }
        }

        return resultado;
    }
}
