package algorithm.arrays_hashing;


import java.util.Arrays;

/**
 * Даны две строки s и t. Верните true, если эти две строки являются анаграммами друг друга,
 * в противном случае верните false.
 *
 * Анаграмма — это строка, которая содержит те же самые символы,
 * что и другая строка,
 * но порядок символов может быть другим.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        int[] arr = new int[26];
        arr[1]--;
        System.out.println(arr[1]);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
           arr[sArray[i] - 'a']++;
           arr[tArray[i] - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}
