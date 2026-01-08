// Last updated: 1/8/2026, 10:35:41 AM
1class Solution {
2    Integer[][] dp;
3    public boolean predictTheWinner(int[] nums) {
4        int n = nums.length;
5        dp = new Integer[n][n];
6        return solve(0 ,n-1, nums) >= 0;
7    }
8    private int solve(int i, int n, int[] nums){
9        if(i==n){
10            return nums[i];
11        }
12        if(dp[i][n] != null){
13            return dp[i][n];
14        }
15        int left = nums[i] - solve(i+1,n,nums);
16        int right =  nums[n] - solve(i, n-1, nums);
17        dp[i][n] = Math.max(left, right);
18
19        return dp[i][n];
20    }
21}