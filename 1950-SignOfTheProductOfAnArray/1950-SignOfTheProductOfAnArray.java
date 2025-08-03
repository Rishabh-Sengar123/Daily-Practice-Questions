// Last updated: 8/3/2025, 9:53:32 AM
class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                return 0;  // If any number is zero, the product is zero
            } else if (num < 0) {
                negativeCount++;
            }
        }
        
        // If the count of negative numbers is even, the product is positive; otherwise, it's negative
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}
