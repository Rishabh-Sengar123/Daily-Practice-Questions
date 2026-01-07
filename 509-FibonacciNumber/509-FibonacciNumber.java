// Last updated: 1/7/2026, 10:03:16 PM
1class Solution {
2    int[] dp;
3    public int fib(int n) {
4        dp = new int[n+1];
5        Arrays.fill(dp , -1);
6        return recursion(n);
7    }
8    private int recursion(int n){
9        //1. Ye hamara base case rahega
10        if(n<=1){
11            return n;
12        }
13        //2. Check that we solve this before or not
14        if(dp[n] != -1){
15            return dp[n];
16        }
17        //3. Yaha pe recursion call kr rahe hai
18        dp[n] = recursion(n-1) + recursion(n-2);
19        return dp[n];
20    }
21}