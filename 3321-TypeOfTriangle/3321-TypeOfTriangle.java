// Last updated: 8/3/2025, 9:52:52 AM
class Solution {
    public String triangleType(int[] nums) {
        int i = 0;
        if(nums[i]+nums[i+1]<=nums[i+2] || nums[i+2]+nums[i]<=nums[i+1] || nums[i+2]+nums[i+1]<=nums[i]){
            return "none";
        }
        else if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
            return "equilateral";
        }else if(nums[i]==nums[i+1] || nums[i]==nums[i+2] || nums[i+2]==nums[i+1]){
            return "isosceles";
        }
        else{
            return "scalene";
        }
        
    }
}