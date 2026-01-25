// Last updated: 1/25/2026, 10:39:42 PM
1class Solution {
2    int[][] dp;
3    public int minDistance(String word1, String word2) {
4        int n = word1.length();
5        int m = word2.length();
6        dp = new int[n][m];
7        for(int i = 0; i < n; i++) {
8            Arrays.fill(dp[i], -1);
9        }
10        return solve(word1 , word2, n-1, m-1);
11    }
12    private int solve(String word1, String word2, int i, int j){
13        if(i<0){
14            return j+1;
15        }
16        if(j<0){
17            return i+1;
18        }
19        if(dp[i][j] != -1){
20            return dp[i][j];
21        }
22        if(word1.charAt(i) == word2.charAt(j)){
23            return dp[i][j] = solve(word1, word2, i-1, j-1);
24        }
25
26        int replace = solve(word1, word2, i-1, j-1);
27        int delete = solve(word1, word2, i-1, j);
28        int insert = solve(word1, word2, i, j-1);
29
30        return dp[i][j] = 1 + Math.min(replace, Math.min(delete, insert));
31
32        
33    }
34}