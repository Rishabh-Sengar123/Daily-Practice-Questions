// Last updated: 8/24/2025, 6:53:10 PM
class Solution {
    public String reverseWords(String str) {
        String[] words = str.split(" "); 
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()); 
            result.append(" "); 
        }
        
        return result.toString().trim();
    }
}