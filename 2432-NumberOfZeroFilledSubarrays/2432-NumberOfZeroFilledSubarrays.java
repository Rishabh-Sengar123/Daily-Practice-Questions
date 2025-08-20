// Last updated: 8/20/2025, 10:34:20 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;  
        long consecutiveZeros = 0;  

        for (int num : nums) {
            if (num == 0) {
                consecutiveZeros++;  
                count += consecutiveZeros;  
            } else {
                consecutiveZeros = 0;  
            }
        }

        return count;
    }
}
