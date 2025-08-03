// Last updated: 8/3/2025, 9:53:11 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int ans = 0;
        for(int i=0 ; i < nums.length; i++){
            ans = Math.max(max, nums[i]);
            max = ans;
        }
        int count = 0;
        int fuck = 0;
        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] == max){
                count++;
                fuck = Math.max(count, fuck);
            }else{
                count = 0;
            }
        }
        return fuck;
    }
}