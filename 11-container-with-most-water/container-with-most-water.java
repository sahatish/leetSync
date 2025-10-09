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
