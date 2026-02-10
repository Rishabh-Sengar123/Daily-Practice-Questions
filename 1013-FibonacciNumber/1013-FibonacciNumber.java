// Last updated: 2/10/2026, 3:21:32 PM
class Solution {
    int[] dp;
    public int fib(int n) {
        dp = new int[n+1];
        Arrays.fill(dp , -1);
        return recursion(n);
    }
    private int recursion(int n){
        //1. Ye hamara base case rahega
        if(n<=1){
            return n;
        }
        //2. Check that we solve this before or not
        if(dp[n] != -1){
            return dp[n];
        }
        //3. Yaha pe recursion call kr rahe hai
        dp[n] = recursion(n-1) + recursion(n-2);
        return dp[n];
    }
}