class Solution {
    public static int maxArea(int[] height) {

        int maxWater = 0;
        int lp = 0, rp = height.length - 1; 

        while (lp < rp) {
            int wt = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int currentWater = wt * ht;

            maxWater = Math.max(maxWater, currentWater);

            if (height[lp] < height[rp])
                lp++;
            else
                rp--;
        }

        return maxWater;
    }
}
 // brute force
//   public class Main{
//     public static int containerwithmostWater(int[] arr){ 
        
//         int maxWater = 0;
//         int n = arr.length;
        
//         for(int i = 0; i< n; i++){
//             for(int j = i + 1; j<n; j++){
                
//                 int  width = j - i ;
//                 int height = Math.min(arr[i], arr[j]);
//                 int  Water = width * height;
                
//                 maxWater = Math.max(maxWater,Water);
                
//             }
//         }
//         return maxWater;
//     }
    
//     public static void main(String[] args){
//         int [] arr = {1,8,6,2,5,2,4,8,3,7};
//         System.out.println("containerwithmostWater :" + containerwithmostWater(arr));
//     }
// }