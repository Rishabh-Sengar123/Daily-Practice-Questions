// Last updated: 1/8/2026, 9:36:23 AM
1class Solution {
2    //Use Wrapper dp to store null as default data 
3    //Three value can be store true, false, null.
4    Boolean[][] dp;
5    public boolean isSubsequence(String s, String t) {
6        int n = s.length();
7        int m = t.length();
8        dp = new Boolean[n+1][m+1];
9        return solve(n,m,s,t);
10    }
11    private boolean solve(int n , int m , String s, String t){
12        if(n==0){
13            return true;
14        }
15        if(m==0){
16            return false;
17        }
18        if(dp[n][m] != null){
19            return dp[n][m];
20        }
21        if(s.charAt(n-1) == t.charAt(m-1)){
22            dp[n][m] = solve(n-1,m-1,s,t);
23        }else{
24            dp[n][m] = solve(n,m-1,s,t);
25        }
26        return dp[n][m];
27    }
28}