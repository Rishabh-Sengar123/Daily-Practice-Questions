// Last updated: 8/14/2025, 10:41:43 AM
class Solution {
    public String largestGoodInteger(String num) {
        String s = "";

        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                String candidate = num.substring(i, i+3);
                if (candidate.compareTo(s) > 0) { // lexicographically larger
                    s = candidate;
                }
            }
        }
        return s;
    }
}
