// Last updated: 1/8/2026, 12:11:12 AM
1class Solution {
2    int[][] dp;
3    public List<Integer> getRow(int rowIndex) {
4        List<Integer> result = new ArrayList<>();
5        dp = new int[rowIndex+1][rowIndex+1];
6        for(int i=0; i<=rowIndex; i++){
7            Arrays.fill(dp[i] , -1);
8        }
9        for(int n=0; n<=rowIndex; n++){
10            result.add(solve(rowIndex, n, dp));
11        }
12        return result;
13
14    }
15    public int solve(int row, int n , int[][] dp){
16        if(n == 0 || n == row ){
17            return 1;
18        }
19        if(dp[row][n] != -1){
20            return dp[row][n];
21        }
22        dp[row][n] = solve(row-1, n-1, dp) + solve(row-1, n, dp);
23
24        return dp[row][n];
25    }
26}