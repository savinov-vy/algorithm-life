package algorithm.arrays_hashing;

import java.util.*;

/**
 * Сделал с ошибкой! Нужно пересдать
 *
 * Дан массив строк strs. Сгруппируйте все анаграммы вместе в подсписки.
 * Вы можете вернуть результат в любом порядке.
 * <p>
 * Анаграмма — это строка, которая содержит те же самые символы,
 * что и другая строка, но порядок символов может отличаться.
 * <p>
 * Пример:
 * Вход: strs = ["eat","tea","tan","ate","nat","bat"]
 * Выход: [["eat","tea","ate"],["tan","nat"],["bat"]]
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> lists = groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println(lists);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagrams = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String group = new String(charArray);
            List<String> anagrams;
            if (!groupAnagrams.containsKey(group)) {
                anagrams = new ArrayList<>();
                anagrams.add(str);
                groupAnagrams.put(group, anagrams);
            } else {
                anagrams = groupAnagrams.get(group);
                anagrams.add(str);
            }
        }
        return new ArrayList<>(groupAnagrams.values());
    }
}
