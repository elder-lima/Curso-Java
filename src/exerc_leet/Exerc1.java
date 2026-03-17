package exerc_leet;

public class Exerc1 {
    public static void main(String[] args) {

        int[] array = new int[]{2,1,5,1,3,2};
        int k = 3;
        System.out.println(exerc(array, k));

    }
    public static int exerc(int[] nums, int k) {

        int soma = 0;

        for(int i = 0; i < k; i++) {
            soma += nums[i];
        }

        int max = soma;

        for(int i = k; i < nums.length; i++) {

            soma += nums[i];       // entra na janela
            soma -= nums[i - k];   // sai da janela

            max = Math.max(max, soma);
        }

        return max;
    }

}
