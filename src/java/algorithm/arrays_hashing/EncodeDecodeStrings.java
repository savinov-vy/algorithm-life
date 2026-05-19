package algorithm.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a string.
 * The encoded string is then sent over the network and is decoded back to the original list of strings.
 *
 * Machine 1 (sender) has the function:
 *
 * String encode(List<String> strs) {
 *     // ... your code
 *     return encoded_string;
 * }
 *
 * Machine 2 (receiver) has the function:
 *
 * List<String> decode(String encoded_string) {
 *     // ... your code
 *     return decoded_strs;
 * }
 *
 * So Machine 1 does:
 *
 * String encoded_string = encode(strs);
 *
 * and Machine 2 does:
 *
 * List<String> decoded_strs = decode(encoded_string);
 */
public class EncodeDecodeStrings {
    public static void main(String[] args) {
        System.out.println("Hetlo".substring(0, 3));
    }

    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append("#").append(str);
        }
        return builder.toString();
    }

    public static List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();
        while (i < str.length()) {
            int j = i;
            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            result.add(str.substring(j+1, j+1+length));
            i = j + 1 + length;
        }
        return result;
    }
}
