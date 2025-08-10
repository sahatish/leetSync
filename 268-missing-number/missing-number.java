class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        int actualValue = (nums.length * (nums.length + 1)) /2;
        int missingNumber = actualValue - sum;
        return missingNumber;    
    }


public static void main(String args[]){
    int nums[] = {3,0,1};
    Solution sol = new Solution(); 
    System.out.println(sol.missingNumber(nums));

}
}