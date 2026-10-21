class Solution {
    public boolean checkRecord(String s) {
        if(s.indexOf('A') != s.lastIndexOf('A')) {
        return false;
        }

          if(s.contains("LLL")){
            return false;
          }

          return true;
        
    }
}