class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cand = 0;
        for(int i=0; i<nums.length; i++){
            //  or we can write = for(int nums : nums)
            if(count == 0){
                cand = nums[i];
            }

            if(cand == nums[i]){
                count ++;
            }else{
                count --;
            }
       }
       return cand;
    }

        public static void main(String[] args){

                int[] nums = {2,2,1,1,1,2,2,2};
                Solution sc = new Solution();
                int result = sc.majorityElement(nums);
                System.out.println(result);

            }
        }
  