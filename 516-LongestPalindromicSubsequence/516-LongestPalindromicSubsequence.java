// Last updated: 3/23/2026, 5:39:02 PM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4        char[] arr = s.toCharArray();
5        char[] arr2 = rev.toCharArray();
6        int n = arr.length;
7        int[][] dp = new int[n+1][n+1];
8        for(int i=1; i<=n; i++){
9            for(int j=1; j<=n; j++){
10                if(arr[i-1] == arr2[j-1]){
11                    dp[i][j] = dp[i-1][j-1] + 1;
12                }else{
13                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
14                }
15            }
16        }
17        return dp[n][n];
18    }
19}