// Last updated: 2/10/2026, 3:19:03 PM
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] oner = new int[grid.length];
        int[] onec = new int[grid[0].length];
        int[][] matrix = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    oner[i]++;
                    onec[j]++;
                }
            }
        }
        for(int i=0; i<grid.length; i++){
            int zero = grid[0].length - oner[i];
            for(int j=0; j<grid[0].length; j++){
                int zeroc = grid.length - onec[j];
                matrix[i][j] = oner[i] + onec[j] - zero - zeroc;

            }
        }
        return matrix;
    }
}