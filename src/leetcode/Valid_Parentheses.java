package leetcode;

import java.util.Stack;

class Solution4 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (c == ')' || c == ']' || c == '}') {
                    return false;
                }
                stack.push(c);
            } else {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    char e = stack.pop();
                    if (e == '(' && c != ')') {
                        return false;
                    }
                    if (e == '[' && c != ']') {
                        return false;
                    }
                    if (e == '{' && c != '}') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

public class Valid_Parentheses {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        String s = "([)]";
        System.out.println(solution.isValid(s));
    }
}
