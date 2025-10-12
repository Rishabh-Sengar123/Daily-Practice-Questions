// Last updated: 10/12/2025, 2:29:57 PM
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