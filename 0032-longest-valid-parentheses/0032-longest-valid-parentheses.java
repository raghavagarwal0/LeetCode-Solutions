import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Deque stack = new ArrayDeque<>();
        stack.push(-1); // Base index for boundary calculation

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    // Current ')' is unmatched; reset the boundary
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - (int)stack.peek());
                }
            }
        }

        return maxLen;
    }
}