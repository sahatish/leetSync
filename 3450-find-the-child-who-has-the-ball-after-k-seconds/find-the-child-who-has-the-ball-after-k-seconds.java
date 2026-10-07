class Solution {
    public int numberOfChild(int n, int k) {
         int cycle =  2 * ( n - 1);
         int pos = k % cycle;

         if( pos <= n - 1) {
            return pos;
         }else {
            return cycle - pos;
         }
        
    }
}