package ExerciciosLeet.vetores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Teste {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] results = twoSum(nums, target);
        System.out.println(results[0] + " " + results[1]);


    }

    public static int[] twoSum(int[] nums, int target) {

        // HashMap<Integer, Integer> cal = new HashMap<>();

        // [ 2, 7, 11, 15]
        // chave: 7  | valor: 2
        // chave: 2  | valor: 7
        // chave: -2 | valor: 11
        // chave: -6 | valor: 15

//        for(int i=0; i<nums.length; i++) {
//            int sub = target - nums[i];
//            if(cal.containsKey(nums[i])) {
//                int val = cal.get(nums[i]);
//                return new int[]{i, val};
//            }
//            cal.put(sub, i);
//        }
//        return null;
        HashMap<Integer, Integer> hasher = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cal = target - nums[i];
            if (hasher.containsKey(nums[i])) {
                int val = hasher.get(nums[i]);
                return new int[]{val, i};
            }
            hasher.put(cal, i);
        }
        return null;
    }
}
