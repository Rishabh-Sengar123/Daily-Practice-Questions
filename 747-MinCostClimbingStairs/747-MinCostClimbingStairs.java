// Last updated: 2/10/2026, 3:22:11 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //1. Create a Dp
        int n = cost.length;
        int[] dp = new int[n+1];
       
        Arrays.fill(dp, -1);
        int ans = Math.min(solve(cost, n-1, dp) , solve(cost, n-2, dp));
        return ans;

    }
    private int solve(int[] cost, int n , int[] dp){
        //Ye apna base case rahega
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        //Value agar phle nikli hai to return kro simple
        if(dp[n] != -1){
            return dp[n];
        }
        //Step 3. Yaha par dp ko calculate kiya hai
        dp[n] = cost[n] + Math.min(solve(cost, n-1, dp) , solve(cost, n-2, dp));

        return dp[n];
    }
}