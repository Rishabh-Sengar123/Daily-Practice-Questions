// Last updated: 8/3/2025, 9:53:50 AM
import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy of heights array
        int[] nums = Arrays.copyOf(heights, heights.length);
        
        // Sort the copied array
        Arrays.sort(nums);
        
        int count = 0;
        
        // Compare the original and sorted arrays
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != nums[i]) {
                count++;
            }
        }
        
        return count;
    }
}
