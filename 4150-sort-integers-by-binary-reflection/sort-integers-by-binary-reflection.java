class Solution {
    public int[] sortByReflection(int[] nums) {
    Integer[] arr = new Integer[nums.length];

    for(int i = 0; i < nums.length; i++) {
        arr[i] = nums[i];
    }

    Arrays.sort(arr, ( a, b) -> {
        int ra = reflect(a);
        int rb = reflect(b);

        if( ra != rb) {
            return Integer.compare(ra, rb);
        }
        return Integer.compare(a, b);
    });

    for( int i = 0; i < nums.length; i++) {
        nums[i] = arr[i];
    }
    return nums;
        
    }

    private int reflect (int num) {
        int reversed = 0;

        while( num > 0) { 
            reversed = reversed * 2 + num % 2;
            num /= 2;

        }

        return reversed;
    }
}