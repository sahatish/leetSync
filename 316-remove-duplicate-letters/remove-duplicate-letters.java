import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        boolean[] visited = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            if (visited[c - 'a']) continue;

            while (!stack.isEmpty() && stack.peekLast() > c && freq[stack.peekLast() - 'a'] > 0) {
                char removed = stack.removeLast();
                visited[removed - 'a'] = false;
            }

            stack.addLast(c);
            visited[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
