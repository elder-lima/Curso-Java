package exerc_leet;

public class Exerc2 {
    public static void main(String[] args) {

        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(exerc2(nums, k));

    }
    public static double exerc2(int[] nums, int k) {

        double media = 0;
        double soma = 0;

        for (int x=0; x < k; x++) {
            soma += nums[x];
        }

        media = soma / k;

        for (int i = k; i < nums.length; i++) {

            soma += nums[i];
            soma -= nums[i - k];

            media = Math.max(media, soma / 4);

        }

        return media;
    }
}
