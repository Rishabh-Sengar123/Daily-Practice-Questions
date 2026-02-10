// Last updated: 2/10/2026, 3:20:00 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        for(int i= nums.length; i<2*nums.length; i++){
            arr[i] = nums[i-nums.length];
        }
        return arr;
    }
}