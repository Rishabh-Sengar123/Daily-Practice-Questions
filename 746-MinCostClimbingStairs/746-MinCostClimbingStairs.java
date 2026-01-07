// Last updated: 1/7/2026, 10:59:26 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        //1. Create a Dp
4        int n = cost.length;
5        int[] dp = new int[n+1];
6       
7        Arrays.fill(dp, -1);
8        int ans = Math.min(solve(cost, n-1, dp) , solve(cost, n-2, dp));
9        return ans;
10
11    }
12    private int solve(int[] cost, int n , int[] dp){
13        //Ye apna base case rahega
14        if(n==0){
15            return cost[0];
16        }
17        if(n==1){
18            return cost[1];
19        }
20        //Value agar phle nikli hai to return kro simple
21        if(dp[n] != -1){
22            return dp[n];
23        }
24        //Step 3. Yaha par dp ko calculate kiya hai
25        dp[n] = cost[n] + Math.min(solve(cost, n-1, dp) , solve(cost, n-2, dp));
26
27        return dp[n];
28    }
29}