// Last updated: 8/3/2025, 9:53:29 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        
        return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
       
    }
}