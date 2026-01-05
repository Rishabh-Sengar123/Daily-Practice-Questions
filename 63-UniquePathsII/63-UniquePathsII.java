// Last updated: 1/5/2026, 10:03:52 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5        int[][] dp = new int[m][n];
6        if(obstacleGrid[0][0]==1){
7            return 0;
8        }
9        dp[0][0] = 1;
10        for(int i=1; i<m; i++){
11            if(obstacleGrid[i][0] == 1){
12                dp[i][0] = 0;
13            }else{
14                dp[i][0] = dp[i-1][0];
15            }
16        }
17        for(int j=1; j<n; j++){
18            if(obstacleGrid[0][j] == 1){
19                dp[0][j] = 0;
20            }else{
21                dp[0][j] = dp[0][j-1];
22            }
23        }
24        for(int i=1; i<m; i++){
25            for(int j=1; j<n; j++){
26                if(obstacleGrid[i][j] == 1){
27                    dp[i][j] = 0;
28                }else{
29                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
30                }
31            }
32        }
33        return dp[m-1][n-1];
34    }
35}