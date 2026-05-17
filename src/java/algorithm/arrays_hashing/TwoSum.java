package algorithm.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[26];
        arr[1]--;
        System.out.println(arr[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> indexByValue = new HashMap<>();
        indexByValue.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (indexByValue.containsKey(target - nums[i])) {
                result[0] = indexByValue.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            indexByValue.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
