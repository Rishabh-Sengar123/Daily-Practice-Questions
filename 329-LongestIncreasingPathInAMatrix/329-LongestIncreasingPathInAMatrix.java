// Last updated: 8/3/2025, 9:54:31 AM
class Solution {
    private int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int m, n;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        m = matrix.length;
        n = matrix[0].length;

        int[][] memo = new int[m][n];
        int maxLen = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxLen = Math.max(maxLen, dfs(matrix, i, j, memo));
            }
        }

        return maxLen;
    }

    private int dfs(int[][] matrix, int row, int col, int[][] memo) {
        if (memo[row][col] != 0) return memo[row][col];

        int max = 1;
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n &&
                matrix[newRow][newCol] > matrix[row][col]) {
                int len = 1 + dfs(matrix, newRow, newCol, memo);
                max = Math.max(max, len);
            }
        }

        memo[row][col] = max;
        return max;
    }
}
