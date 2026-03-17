package exerc_leet;

public class MaiorNum {
    public static void main(String[] args) {
        int[] array = new int[]{9,7,1,2,105,77,88,99};
        System.out.println(maior(array));
    }
    public static int maior(int[] array) {

        int max = 0;

        for (int num : array) {
            max = Math.max(max, num);
        }

        return max;
    }
}
