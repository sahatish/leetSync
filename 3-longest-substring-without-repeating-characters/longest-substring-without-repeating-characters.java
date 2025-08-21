import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // If duplicate, shrink from left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add current character
            set.add(s.charAt(right));
            
            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
