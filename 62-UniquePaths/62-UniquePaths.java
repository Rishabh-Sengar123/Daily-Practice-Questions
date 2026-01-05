// Last updated: 1/5/2026, 9:40:43 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        for(int i=0; i<m; i++){
5            dp[i][0] = 1;
6        }
7
8        for(int i=0; i<n; i++){
9            dp[0][i] = 1;
10        }
11
12        for(int i=1; i<m; i++){
13            for(int j=1; j<n; j++){
14                dp[i][j] = dp[i][j-1] + dp[i-1][j];
15            }
16        }
17
18        return dp[m-1][n-1];
19    }
20}