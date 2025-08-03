// Last updated: 8/3/2025, 9:53:19 AM
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i= 0; i< nums.length ; i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}