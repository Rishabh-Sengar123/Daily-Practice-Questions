// Last updated: 8/21/2025, 10:49:27 AM
public class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dp = new int[m][n];
        int res = 0;
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    dp[i][j] = (j == 0 ? 1 : dp[i][j - 1] + 1);
                }
            }
        }
        
       
        for (int j = 0; j < n; ++j) {
            for (int i = 0; i < m; ++i) {
                if (mat[i][j] == 0) continue;
                int minWidth = dp[i][j];
                for (int k = i; k >= 0 && minWidth > 0; k--) {
                    minWidth = Math.min(minWidth, dp[k][j]);
                    res += minWidth;
                }
            }
        }
        return res;
    }
}
