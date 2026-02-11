// Last updated: 2/11/2026, 10:54:47 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int far = 0;
4        for(int i = 0; i<nums.length; i++){
5            if(i>far){
6                return false;
7            }
8
9            far = Math.max(far, i+nums[i]);
10            if(far > nums.length-1){
11                return true;
12            }
13        }
14        return true;
15    }
16}