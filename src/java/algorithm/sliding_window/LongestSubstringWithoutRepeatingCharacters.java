package algorithm.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Самая длинная подстрока без повторяющихся символов
 * Средний уровень Сложность
 * Темы, теги компаний
 * Подсказки
 * Дана строка s. Найдите длину самой длинной подстроки без повторяющихся символов.
 * Подстрока — это непрерывная последовательность символов внутри строки.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lastIndex.containsKey(ch) && lastIndex.get(ch) >= left) {
                left = lastIndex.get(ch) + 1;
            }
            int currentLength = i - left + 1;
            maxLength = Math.max(maxLength, currentLength);
            lastIndex.put(ch, i);
        }
        return maxLength;
    }
}
