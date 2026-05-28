package algorithm.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }
                Character popCh = stack.pop();
                if (popCh == '(' && ch == ')'
                    || popCh == '{' && ch == '}'
                    || popCh == '[' && ch == ']') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
