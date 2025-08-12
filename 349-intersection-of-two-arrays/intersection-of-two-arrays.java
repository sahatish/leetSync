import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> set = new HashSet<>();
        for(int n2 : nums2){
            set.add(n2);
        }

        ArrayList <Integer> list = new ArrayList<>();
        for(int n2 : nums1){
            if(set.contains(n2)){
                list.add(n2);
                set.remove(n2);
            }
        }
            int res[] = new int [list.size()];
            for(int i = 0; i< list.size(); i++){
               res[i] = list.get(i);

        }
        return res;
    }

    public static void main(String[] args){
        Solution sc = new Solution();
        int [] nums1= {1,2,2,1};
        int[] nums2 = { 2,2};
        System.out.println(Arrays.toString(sc.intersection(nums1, nums2)));
       
    }
    }
