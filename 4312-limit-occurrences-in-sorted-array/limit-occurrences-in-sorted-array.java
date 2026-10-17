class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int count = 0;
        int[] result = new int[nums.length];

        for( int num: nums) {
            if( count < k || num != result[ count - k]) {
                result[count] = num;
                count++;
            }
        }

        return java.util.Arrays.copyOf( result, count);
        
    }
}