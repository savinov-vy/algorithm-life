package algorithm.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> differentNumbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (differentNumbers.contains(nums[i])) {
                return true;
            }
            differentNumbers.add(nums[i]);
        }
        return false;
    }
}


