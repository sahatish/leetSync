class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()){
                freq[ c - 'a']++;

            }
            while(result.length() < s.length()) {

                for(int i = 0; i < 26;  i++){
                    if(freq[i] > 0) {
                        result.append((char) (i + 'a'));
                        freq[i]--;
                    }
                }


                for (int i = 25; i >= 0; i--) {
                    if(freq[i] > 0) {
                        result.append((char) (i + 'a'));
                        freq[i]--;
                    }
                }            
        }

        return result.toString();
        
    }
}