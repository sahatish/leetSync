import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int current = 1;  // start from stream = [1, 2, ..., n]
        int index = 0;    // pointer for target

        while (index < target.length) {
            // push every number from the stream
            result.add("Push");
            if (current == target[index]) {
                index++; // matched with target, keep it
            } else {
                result.add("Pop"); // not needed, remove it
            }
            current++;
        }
        return result;
    }
}
