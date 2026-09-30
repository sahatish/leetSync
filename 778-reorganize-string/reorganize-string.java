class Solution {
    public String reorganizeString(String s) {

        int[] freq = new int[26];

        for(char ch: s.toCharArray()){
            freq[ ch - 'a']++;

        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> b[1] - a[1]
        );

        for( int i = 0; i < 26; i++){
            if(freq[i] > 0) {
                pq.offer(new int[]{i, freq[i]});
            }
        }

        StringBuilder ans = new StringBuilder();
        int[] previous = null;

        while(!pq.isEmpty()) {
            int[] current = pq.poll();

            ans.append((char) (current[0] + 'a'));
            current[1]--;

            if(previous !=  null && previous[1] > 0) {
                pq.offer(previous);
            }

            previous = current;
        }

        if( ans.length() != s.length()){
            return "";
        }
        

        return ans.toString();
    }
}
