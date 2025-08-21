// Last updated: 8/21/2025, 10:51:07 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}
