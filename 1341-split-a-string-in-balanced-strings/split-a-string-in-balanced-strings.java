class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int result = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R') {
                balance++;
            } else { // c == 'L'
                balance--;
            }

            if (balance == 0) {
                result++;
            }
        }

        return result;
    }
}
