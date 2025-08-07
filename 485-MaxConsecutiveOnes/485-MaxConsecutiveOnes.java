// Last updated: 8/7/2025, 10:43:17 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i< nums.length ; i++){
            if(nums[i]==1){
                count++;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }
        return max;
    }
}