class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        
        // find indices of min and max
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) minIndex = i;
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }

        // ensure minIndex < maxIndex (for easier handling)
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // Case 1: remove both from the front
        int case1 = maxIndex + 1;
        
        // Case 2: remove both from the back
        int case2 = n - minIndex;
        
        // Case 3: remove min from front and max from back
        int case3 = (minIndex + 1) + (n - maxIndex);

        // take minimum of all cases
        return Math.min(case1, Math.min(case2, case3));
    }
}
