// Last updated: 8/3/2025, 9:53:24 AM
class Solution {
    public String firstPalindrome(String[] words) {
        int length = words.length;
        for(int i =0 ; i < length ; i++){
            String reversed =  new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(reversed)){
                return words[i];
            }
        }
       return "";
    }
}