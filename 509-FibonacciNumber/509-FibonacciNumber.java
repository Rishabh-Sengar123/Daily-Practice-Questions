// Last updated: 1/27/2026, 9:04:18 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count = 0;
4        for(int i=0; i<nums.length; i++){
5            String s = String.valueOf(nums[i]);
6            if(s.length()%2 == 0){
7                count++;
8            }
9        }
10        return count;
11    }
12}