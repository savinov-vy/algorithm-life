package algorithm.two;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        s = s.replaceAll(" ", "");
        char[] sArr = s.toCharArray();
        int indexStart = 0;
        int indexEnd = s.length() - 1;
        while (indexStart < indexEnd) {
            if (sArr[indexStart] != sArr[indexEnd]) {
                return false;
            }
            indexStart++;
            indexEnd--;
        }
        return true;
    }
}
