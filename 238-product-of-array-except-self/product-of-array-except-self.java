class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right *= nums[i];
        }

        return ans;
    }
}// o(n) and o(1)

// 
// tc: o(n) and sp: o(n)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] prefix = new int[n];
//         int[] suffix = new int[n];
//         int[] ans = new int[n];

//         // Build prefix product array
//         prefix[0] = 1;
//         for (int i = 1; i < n; i++) {
//             prefix[i] = prefix[i - 1] * nums[i - 1];
//         }

//         // Build suffix product array
//         suffix[n - 1] = 1;
//         for (int i = n - 2; i >= 0; i--) {
//             suffix[i] = suffix[i + 1] * nums[i + 1];
//         }

//         // Multiply prefix and suffix for the answer
//         for (int i = 0; i < n; i++) {
//             ans[i] = prefix[i] * suffix[i];
//         }

//         return ans;
//     }
// }


// // brute force approach
// import java.util.*;
// public class productarrayexceptself {

//     public static int[] productarrayexceptself(int[] nums){
        
//         int n = nums.length;
//         int[] result = new int[n];

//         for(int i=0; i<n; i++){
//             // int product = 1; not necessary
//             for(int j =0; j<n; j++){
//                 if( i != j){
//                     result[i] *= nums[j]; // we convert this product *= num[j]
//                 }
//            }
//         //    result[i] = product; // no necessarry
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         System.out.println("productarrayexceptself " +Arrays.toString(productarrayexceptself(arr)));
        
//     }