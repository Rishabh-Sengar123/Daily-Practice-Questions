// Last updated: 10/5/2025, 5:45:49 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;
        for(right=0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                count = Math.min(right - left + 1, count);
                sum -= nums[left];
                left++;
            }
            
        }
        return (count == Integer.MAX_VALUE) ? 0 : count;
    }
}