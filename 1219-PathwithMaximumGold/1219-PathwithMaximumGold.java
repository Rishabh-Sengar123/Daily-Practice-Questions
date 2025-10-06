// Last updated: 10/6/2025, 1:14:42 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    private int dfs(int[][] grid, int i, int j) {
        // Base condition: out of bounds or cell is empty
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int gold = grid[i][j];
        grid[i][j] = 0; // mark as visited

        int up = dfs(grid, i - 1, j);
        int down = dfs(grid, i + 1, j);
        int left = dfs(grid, i, j - 1);
        int right = dfs(grid, i, j + 1);

        grid[i][j] = gold; // backtrack (unmark)
        return gold + Math.max(Math.max(up, down), Math.max(left, right));
    }
}
