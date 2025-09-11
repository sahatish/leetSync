class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        Map<Integer, Long> freq = new HashMap<>();
        long pairs = 0;
        
        int left = 0;
        for (int right = 0; right < n; right++) {
            int x = nums[right];
            long f = freq.getOrDefault(x, 0L);
            
            // Adding nums[right] adds "f" new pairs
            pairs += f;
            freq.put(x, f + 1);
            
            // While window is good, shrink from left
            while (pairs >= k) {
                ans += (n - right); // all subarrays [left..right], [left..right+1], ... are good
                
                int y = nums[left];
                long fy = freq.get(y);
                pairs -= (fy - 1); // removing left element reduces pairs
                freq.put(y, fy - 1);
                left++;
            }
        }
        
        return ans;
    }
}
