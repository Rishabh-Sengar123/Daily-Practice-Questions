// Last updated: 2/10/2026, 3:22:49 PM
class Solution {
    Integer[][] dp;
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];
        return solve(0 ,n-1, nums) >= 0;
    }
    private int solve(int i, int n, int[] nums){
        if(i==n){
            return nums[i];
        }
        if(dp[i][n] != null){
            return dp[i][n];
        }
        int left = nums[i] - solve(i+1,n,nums);
        int right =  nums[n] - solve(i, n-1, nums);
        dp[i][n] = Math.max(left, right);

        return dp[i][n];
    }
}