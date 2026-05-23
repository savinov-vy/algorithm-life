package algorithm.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Дан массив целых чисел nums.
 * Верните true, если любое значение встречается в массиве более одного раза,
 * в противном случае верните false.
 */
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


