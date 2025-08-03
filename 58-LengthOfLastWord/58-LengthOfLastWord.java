// Last updated: 8/3/2025, 10:43:21 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] fcuk = s.trim().split("\\s+");;
        String last = fcuk[fcuk.length - 1];
        int leng = last.length();
        return leng;
    }
}