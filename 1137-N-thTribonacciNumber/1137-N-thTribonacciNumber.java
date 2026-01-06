// Last updated: 1/6/2026, 11:12:48 AM
1class Solution {
2    public int tribonacci(int n) {
3        if(n==0){
4            return 0;
5        }
6        if(n == 1 || n == 2){
7            return 1;
8        }
9        int[] dp = new int[n+1];
10        dp[0] = 0;
11        dp[1] = 1;
12        dp[2] = 1;
13
14        for(int i=3; i<=n; i++){
15            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
16        }
17        return dp[n];
18    }
19}