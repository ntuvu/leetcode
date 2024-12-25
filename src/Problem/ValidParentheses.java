package Problem;

import java.util.Stack;

//()[]{}
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stacks = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '(') {
                stacks.push(')');
            } else if (c == '[') {
                stacks.push(']');
            } else if (c == '{') {
                stacks.push('}');
            } else if (stacks.isEmpty() || stacks.pop() != c) {
                return false;
            }
        }

        return stacks.isEmpty();

    }
}
