class Solution {
    public int minimumOperations(List<Integer> nums) {

        int dp1 = 0;
        int dp2 = 0;
        int dp3 = 0;

        for(int num : nums) {
            int newDp1 = dp1;
            int newDp2 = dp2;
            int newDp3 = dp3;

            if( num == 1){
                newDp1 = dp1 ;
                newDp2 = dp2 + 1;
                newDp3 = dp3+ 1;
            }

            else if ( num == 2) {
                newDp1 = dp1 + 1;
                newDp2 = Math.min(dp1, dp2);
                newDp3 = dp3 + 1;
            }
        else {
            newDp1 = dp1 + 1;
            newDp2 = dp2 + 1;
            newDp3 = Math.min(dp1, Math.min(dp2, dp3));
        }

        dp1 = newDp1;
        dp2 = newDp2;
        dp3 = newDp3;

        }

        return Math.min(dp1, Math.min(dp2, dp3));
        
    }
}