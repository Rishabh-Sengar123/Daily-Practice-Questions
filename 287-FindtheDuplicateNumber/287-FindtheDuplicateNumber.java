// Last updated: 8/11/2025, 10:36:22 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]==nums[i]){
                return nums[i];
            }
        }
        return 1;

    }
}