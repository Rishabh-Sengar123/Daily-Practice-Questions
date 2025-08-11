// Last updated: 8/11/2025, 11:11:55 PM
import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double average = Double.MAX_VALUE;
        while(left < right){
            double min = (nums[left]+nums[right])/2.0;
            average = Math.min(average, min);
            left++;
            right--;
        }
        return average;
    }
}
