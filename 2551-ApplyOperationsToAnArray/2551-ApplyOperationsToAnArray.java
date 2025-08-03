// Last updated: 8/3/2025, 9:53:07 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        int[]  res = new int[nums.length];      
            for(int i=0; i< nums.length-1 ; i++){
            if(nums[i]==nums[i+1]){
                nums[i]= 2*nums[i];
                nums[i+1]= 0;
            }
        }
        int index = 0;
        for(int num : nums){
            if(num != 0){
                res[index++]=num;
            }
        }
        return res;
    }
}