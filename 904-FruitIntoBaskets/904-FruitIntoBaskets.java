// Last updated: 9/26/2025, 2:15:21 PM
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}