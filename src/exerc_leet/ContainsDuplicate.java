package exerc_leet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,8};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int x=0; x < nums.length; x++) {
            if (!set.add(nums[x])) {
                return true;
            }
        }

        return false;
    }
}
