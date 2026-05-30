package algorithm.binary_search;

/**
 * Вам дан массив длины n, который изначально был отсортирован по возрастанию.
 * Затем он был циклически сдвинут (ротирован) от 1 до n раз.
 * Например, массив nums = [1,2,3,4,5,6] может превратиться в:
 * [3,4,5,6,1,2], если его сдвинули 4 раза.
 * [1,2,3,4,5,6], если его сдвинули 6 раз.
 * Дан ротированный отсортированный массив nums и целое число target.
 * Нужно вернуть индекс target в массиве nums или -1, если элемент отсутствует.
 * Можно считать, что все элементы в ротированном отсортированном массиве уникальны.
 * Решение за O(n) — тривиально, но сможете ли вы написать алгоритм, работающий за O(log n)?
 * <p>
 * смысл решения в том что ищем всегда в отсортированной половине, для не отсортированной
 * отталкиваемся от обратного
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m;
            }
            if (nums[l] <= nums[m]) {
                if (target < nums[m] && target >= nums[l]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (target > nums[m] && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
