// Last updated: 2/10/2026, 3:17:38 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum%k == 0){
            return 0;
        }else{
            return sum%k;
        }
    }
}