class Solution { 
    public String makeFancyString(String s) { 
        StringBuilder result = new StringBuilder(); 


         for(char ch : s.toCharArray()) {  
            int n = result.length(); 

            if(n >= 2 && result.charAt(n - 1) == ch && result.charAt(n - 2) == ch) { 
                continue; 
            } 

           result.append(ch); 
        } 

        return result.toString(); 
    } 
}
        
    


