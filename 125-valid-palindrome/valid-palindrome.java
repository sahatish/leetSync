class Solution {
    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length()-1; 

        while(start < end){
            // left alpha numeric
            if(!Character.isLetterOrDigit(str.charAt(start))){
            start ++;
            continue;
            }

             if(!Character.isLetterOrDigit(str.charAt(end))){
               end --;
               continue;
               
        }
        if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
            return false;
    }
     start++;
     end-- ;

} 
return true;
}

public static void main(String[] args){
    String s =  "A man, a plan, a canal: Panama";
    System.out.println(s + " is a palindrome" + isPalindrome(s));
}
}