class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;
          

           for( int i = 0; i < dimensions.length; i++){
              int length = dimensions[i][0];
              int width = dimensions[i][1];

              int diagonal = length * length + width * width;
              int area = length * width;

              if( diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
              } else if ( diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
              }
           }
        return maxArea;
    }
}