package exerc_leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]

        int[] nums = new int[]{3,3};
        int target = 6;
        int[] resultado = twoSum(nums, target);
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x=0; x < nums.length; x++) {

            int val = nums[x];
            int cal = target - val;

            if (map.containsKey(cal)) {
                int indiceMap = map.get(cal);
                return new int[]{indiceMap, x};
            }

            map.put(val, x);
        }

        return new int[0];
    }
}
