// Last updated: 1/5/2026, 3:46:57 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row = matrix.length;
4        int c = matrix[0].length;
5        for(int i=0; i<row; i++){
6            for(int j=0; j<c; j++){
7                if(matrix[i][j] == target){
8                    return true;
9                }
10            }
11        }
12        return false;
13    }
14}