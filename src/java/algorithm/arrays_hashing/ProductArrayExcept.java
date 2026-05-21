package algorithm.arrays_hashing;

/**
 * Повторить
 *
 * Products of Array Except Self
 * Medium Topics Company Tags
 * Hints
 *
 * Given an integer array nums, return an array output where output[i] is the product of
 * all the elements of nums except nums[i].
 *
 * Each product is guaranteed to fit in a 32-bit integer.
 *
 * Follow-up: Could you solve it in O(n)O(n) time without using the division operation?
 *
 * Example 1:
 */
public class ProductArrayExcept {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,4,6});
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = leftProduct[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return result;
    }
}
