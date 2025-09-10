// Last updated: 9/10/2025, 11:59:11 AM
import java.util.*;

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, -1);
        return minimumPath(grid, 0, 0, dp);
    }

    public int minimumPath(int[][] grid, int cr, int cc, int[][] dp) {
    
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }

        if (cr >= grid.length || cc >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

  
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }

        
        int down = minimumPath(grid, cr + 1, cc, dp);
        int right = minimumPath(grid, cr, cc + 1, dp);

      
        return dp[cr][cc] = Math.min(down, right) + grid[cr][cc];
    }
}
