// Last updated: 8/3/2025, 9:55:07 AM
class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i =0 ; i< nums.length ; i++){

                    num ^= nums[i];
              
        }
        return num;
    }
}