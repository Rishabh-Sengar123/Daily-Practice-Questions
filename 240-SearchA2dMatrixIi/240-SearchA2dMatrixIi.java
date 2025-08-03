// Last updated: 8/3/2025, 9:54:42 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;
        while(row <= matrix.length - 1 && col >= 0){
            if(target == matrix[row][col]){
                return true;
            }else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}