// Last updated: 9/29/2025, 11:46:54 PM
class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int len = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    // start DFS from first land cell
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int i, int j) {
        // Base case: water or out of bounds contributes 1 to perimeter
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }

        // If already visited, no extra perimeter
        if (grid[i][j] == -1) {
            return 0;
        }

        // mark as visited
        grid[i][j] = -1;

        int perimeter = 0;
        perimeter += dfs(grid, i + 1, j);
        perimeter += dfs(grid, i - 1, j);
        perimeter += dfs(grid, i, j + 1);
        perimeter += dfs(grid, i, j - 1);

        return perimeter;
    }
}
