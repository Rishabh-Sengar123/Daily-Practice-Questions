// Last updated: 8/25/2025, 11:40:59 PM
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