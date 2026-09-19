class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while ( i >= 0 || j >= 0){
            int skips = 0;
            while(i >= 0) {
                if (s.charAt(i) == '#') {
                    skips++;
                    i--;
                } else if (skips > 0) {
                    skips--;
                    i--;
                }else {
                    break;
                }
            }

            int skipT = 0;
            while (j >= 0) {
                if( t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
                }

                if( i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                    return false;
                }

                if((i >= 0) != (j >= 0)) {
                    return false;
                }

                i--;
                j--;

            }

            return true;
        }
        
    }
