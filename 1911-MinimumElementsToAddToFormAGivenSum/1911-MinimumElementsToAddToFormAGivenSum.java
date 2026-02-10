// Last updated: 2/10/2026, 3:20:16 PM
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int i=0; i<nums.length ; i++){
            sum += nums[i];
        }
        long diff = Math.abs(sum-goal);

        int result = (int)((diff+limit-1)/limit);

        return result;
    }
}