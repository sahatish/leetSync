import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
            if (seen[idx]) continue;
            
            while (!stack.isEmpty() && c < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }
            
            stack.push(c);
            seen[idx] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}
