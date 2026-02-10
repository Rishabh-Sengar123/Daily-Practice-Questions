// Last updated: 2/10/2026, 3:20:02 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}