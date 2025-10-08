import java.util.HashMap;

class Solution {
    public static int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 2) {
                result ^= num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 3};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {1, 2, 2, 1};

        System.out.println(duplicateNumbersXOR(nums1)); // 1
        System.out.println(duplicateNumbersXOR(nums2)); // 0
        System.out.println(duplicateNumbersXOR(nums3)); // 3
    }
}
