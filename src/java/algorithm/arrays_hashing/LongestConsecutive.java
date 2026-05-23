package algorithm.arrays_hashing;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дан массив целых чисел nums.
 * Верните длину самой длинной последовательности подряд идущих элементов,
 * которую можно составить.
 */
public class LongestConsecutive {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{2,20,4,10,3,4,5}));

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        int longestConsecutive = 0;
        for (Integer i : numsSet) {
            if (!numsSet.contains(i - 1)) {
                int consecutive = 1;
                int nextValue = i + 1;
                while (numsSet.contains(nextValue)) {
                    nextValue++;
                    consecutive++;
                }
                longestConsecutive = Math.max(longestConsecutive, consecutive);
            }
        }
        return longestConsecutive;
    }
}
