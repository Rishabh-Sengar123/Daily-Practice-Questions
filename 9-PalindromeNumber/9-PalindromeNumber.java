// Last updated: 8/3/2025, 10:44:06 AM
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers or multiples of 10 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed_int = 0;
        // Reverse only half of the number
        while (x > reversed_int) {
            int pop = x % 10;
            x /= 10;

            reversed_int = (reversed_int * 10) + pop;
        }

        // Check if the original number or its truncated version matches the reversed number
        return x == reversed_int || x == reversed_int / 10;
    }
}
