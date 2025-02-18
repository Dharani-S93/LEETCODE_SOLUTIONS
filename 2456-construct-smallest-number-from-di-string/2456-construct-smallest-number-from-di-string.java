import java.util.*;

class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder r = new StringBuilder();
                for (int i = 0; i <= pattern.length(); i++) {
            stack.push(i + 1);
                        if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    r.append(stack.pop());
                }
            }
                }
        return r.toString();
    }
}
