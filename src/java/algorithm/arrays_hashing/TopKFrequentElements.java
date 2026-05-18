package algorithm.arrays_hashing;

import java.util.*;

/**
 * Сделал с ошибкой! Нужно пересдать
 * Дан целочисленный массив nums и целое число k. Нужно вернуть k самых часто встречающихся элементов в массиве.
 * <p>
 * Тестовые случаи составлены так, что ответ всегда единственный.
 * <p>
 * Порядок вывода может быть любым.
 * <p>
 * Input: nums = [1,2,2,3,3,3], k = 2
 * <p>
 * Output: [2,3]
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        Arrays.stream(topKFrequent(new int[]{1,2,2,3,3,3}, 2)).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyByNum = new HashMap<>();
        for (int num : nums) {
            Integer frequency = frequencyByNum.getOrDefault(num, 0);
            frequencyByNum.put(num, frequency + 1);
        }

        List<Integer>[] frequencyBucket = new List[nums.length + 1];
        for (int i = 0; i < frequencyBucket.length; i++) {
            frequencyBucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entryFbN : frequencyByNum.entrySet()) {
            frequencyBucket[entryFbN.getValue()].add(entryFbN.getKey());
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for (int i = frequencyBucket.length - 1; i > 0 && resultIndex < k; i--) {
            for (int num : frequencyBucket[i]) {
                result[resultIndex++] = num;
                if (resultIndex == k) {
                    break;
                }
            }
        }
        return result;
    }
}

