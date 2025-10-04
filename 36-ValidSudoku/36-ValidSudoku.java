// Last updated: 10/4/2025, 3:28:31 PM
class Solution {
    public boolean isValidSudoku(char[][] matrix) {
        int length = matrix.length;
        int colLength = matrix[0].length;

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < colLength; col++) {
                char num = matrix[row][col];
                if (num == '.') continue; 

                for (int i = 0; i < colLength; i++) {
                    if (i != col && matrix[row][i] == num) {
                        return false;
                    }
                }
                for (int i = 0; i < length; i++) {
                    if (i != row && matrix[i][col] == num) {
                        return false;
                    }
                }
                int startRow = row - row % 3;
                int startCol = col - col % 3;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int r = startRow + i;
                        int c = startCol + j;
                        if ((r != row || c != col) && matrix[r][c] == num) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
