// Last updated: 1/25/2026, 10:23:49 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5
6        int[][] dp = new int[n+1][m+1];
7        for(int i = 0; i <= n; i++) dp[i][0] = i; 
8        for(int j = 0; j <= m; j++) dp[0][j] = j; 
9
10        for(int i = 1; i <= n; i++) {
11            for(int j = 1; j <= m; j++) {
12                if(word1.charAt(i-1) == word2.charAt(j-1)) {
13                    dp[i][j] = dp[i-1][j-1]; 
14                } else {
15                    dp[i][j] = 1 + Math.min(
16                        dp[i-1][j-1], // replace
17                        Math.min(dp[i-1][j],   // delete
18                                 dp[i][j-1])   // insert
19                    );
20                }
21            }
22        }
23        return dp[n][m];
24    }
25}
26