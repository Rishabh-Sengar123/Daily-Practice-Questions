// Last updated: 10/2/2025, 3:29:12 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
