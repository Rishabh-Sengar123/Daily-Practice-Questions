// Last updated: 2/10/2026, 3:20:44 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i] + sum;
            sum = arr[i];
        }
        return arr;
    }
}