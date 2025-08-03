// Last updated: 8/3/2025, 9:53:34 AM
class Solution {
    public int specialArray(int[] nums) {
        int size = nums.length;
        
        int[] freq = new int[size + 1];
        for (int indx = 0; indx < size; indx++) {
            freq[Math.min(size, nums[indx])]++;
        }
        
        int numGreaterThanOrEqual = 0;
        for (int indx = size; indx >= 1; indx--) {
            numGreaterThanOrEqual += freq[indx];
            if (indx == numGreaterThanOrEqual) {
                return indx;
            }
        }
        
        return -1;
    }
}