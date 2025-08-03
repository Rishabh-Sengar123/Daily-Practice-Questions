// Last updated: 8/3/2025, 9:55:09 AM
class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
}