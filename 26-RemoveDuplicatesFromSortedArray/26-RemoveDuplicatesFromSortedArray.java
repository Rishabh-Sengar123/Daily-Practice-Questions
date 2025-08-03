// Last updated: 8/3/2025, 10:43:41 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 0; i < nums.length - 1 ; i++){
            if(nums[i] != nums[i+1]){
                nums[index] = nums[i+1];
                index++;
            }
        }
        return index;
        }
}