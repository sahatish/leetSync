import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0'); // build the number
            } else if (c == '[') {
                countStack.push(k);
                strStack.push(currStr);
                k = 0;
                currStr = new StringBuilder();
            } else if (c == ']') {
                StringBuilder decoded = strStack.pop();
                int repeat = countStack.pop();
                while (repeat-- > 0) {
                    decoded.append(currStr);
                }
                currStr = decoded;
            } else {
                currStr.append(c);
            }
        }

        return currStr.toString();
    }
}
