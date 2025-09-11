class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        
        // Step 1: Extract vowels
        List<Character> vowelList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelList.add(ch);
            }
        }
        
        // Step 2: Sort vowels by ASCII
        Collections.sort(vowelList);
        
        // Step 3: Reconstruct the string
        StringBuilder result = new StringBuilder();
        int j = 0; // pointer for vowelList
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                result.append(vowelList.get(j++));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
