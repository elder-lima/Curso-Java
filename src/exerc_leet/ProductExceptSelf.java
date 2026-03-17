package exerc_leet;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {

        // Entrada: nums = [1,2,3,4]   |    nums  = [-1,1,0,-3,3]
        // Saída: [24,12,8,6]          |    Saída:  [0,0,9,0,0]

        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        // prefix products
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        // suffix products
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;

    }
}
