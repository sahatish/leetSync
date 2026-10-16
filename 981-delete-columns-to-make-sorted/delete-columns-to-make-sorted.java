class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;

          for(int col = 0; col < strs[0].length(); col++) {
            for( int row = 0; row < strs.length - 1; row++) {
                if(strs[row].charAt(col) > strs[ row + 1].charAt(col)) {
                    count++;
                    break;
                }
            }
          }

          return count;
        
    }
}