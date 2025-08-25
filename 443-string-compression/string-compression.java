class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read = 0, write = 0;

        while (read < n) {
            char currentChar = chars[read];
            int count = 0;

            // Count consecutive same characters
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write the count as digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // new length
    }
}
