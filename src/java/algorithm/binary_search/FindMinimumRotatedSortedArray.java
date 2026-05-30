package algorithm.binary_search;

/**
 * Вам дан массив длины n,
 * который изначально был отсортирован в порядке возрастания.
 * Теперь он был циклически сдвинут от 1 до n раз.
 * Например, массив nums = [1,2,3,4,5,6] может стать:
 * [3,4,5,6,1,2], если его сдвинули 4 раза.
 * [1,2,3,4,5,6], если его сдвинули 6 раз.
 * Обратите внимание,
 * что сдвиг массива на 4 раза перемещает последние четыре элемента массива в начало.
 * Сдвиг массива на 6 раз возвращает исходный массив.
 * Предполагая,
 * что все элементы в сдвинутом отсортированном массиве nums уникальны,
 * верните минимальный элемент этого массива.
 * Решение, работающее за O(n) времени, тривиально.
 * Можете ли вы написать алгоритм, который работает за O(log n) времени?
 */
public class FindMinimumRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 6, 1, 2}));
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return nums[left];
    }
}
