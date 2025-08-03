// Last updated: 8/3/2025, 9:53:33 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for(int i = 0; i < Math.min(word1.length(), word2.length());i++){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            res.append(word1.substring(min));
        }else{
            res.append(word2.substring(min));
        }

        return res.toString();
    }
}