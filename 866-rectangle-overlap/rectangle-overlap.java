class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
       boolean horizontal = Math.max(rec1[0], rec2[0]) < Math.min(rec1[2], rec2[2]);
            boolean vertical = Math.max( rec1[1], rec2[1]) < Math.min(rec1[3], rec2[3]);

        return horizontal && vertical;    

        
    }
}