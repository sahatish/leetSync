import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        int count = 0;

        while (!isSorted(nums)) {
            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i == idx) {
                    temp.add(nums[i] + nums[i + 1]);
                    i++;
                } else {
                    temp.add(nums[i]);
                }
            }

            nums = temp.stream().mapToInt(Integer::intValue).toArray();
            count++;
        }

        return count;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) return false;
        }
        return true;
    }
}
