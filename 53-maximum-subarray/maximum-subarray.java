class Solution {
    public int maxSubArray(int[] n) {

       int maxSum = Integer.MIN_VALUE;
       int currSum = 0;        
       for(int i=0; i<n.length; i++){
              currSum += n[i];
            maxSum = Math.max(currSum, maxSum);
              if ( currSum < 0){
                currSum = 0;
              }
       } 
        return maxSum;
        }
    
     public static void main(String[] args){
         int n = 1;
        int[] arr = { 1};
      
        Solution sc = new Solution();
        int res = sc.maxSubArray(arr);
        System.out.println(" maxSubArraySum" + res );

        }
    }
    
