// Last updated: 8/3/2025, 9:54:48 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while(right < nums.length){
            if(nums[left] == nums[right] ){
                return true;
            }else{
                right++;
                left++;
            }
        }
        return false;
    }
}