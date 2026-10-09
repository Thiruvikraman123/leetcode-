import java.util.*;

class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                // We need two consecutive ')' for each '('
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; // Consume the second ')'
                } else {
                    count++; // Insert one ')' to complete the pair
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++; // Insert a '(' to match this pair
                }
            }
        }

        // Every remaining '(' needs two closing parentheses
        count += stack.size() * 2;

        return count;
    }
}