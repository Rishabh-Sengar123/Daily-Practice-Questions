// Last updated: 8/11/2025, 10:57:29 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}