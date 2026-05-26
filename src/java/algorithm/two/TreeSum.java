package algorithm.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан целочисленный массив nums.
 * Верните все триплеты [nums[i], nums[j], nums[k]], такие что:
 * nums[i] + nums[j] + nums[k] == 0
 * Индексы i, j и k — все различны (разные позиции в массиве)
 * Результат не должен содержать повторяющихся триплетов.
 * Вы можете возвращать результат и сами триплеты в любом порядке.
 */
public class TreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-2, 0, 3, -1, 4, 0, 3, 4, 1, 1, 1, -3, -5, 4, 0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    while (left < right && nums[right] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
