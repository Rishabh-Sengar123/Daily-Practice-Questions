// Last updated: 1/10/2026, 3:39:26 PM
1class Solution {
2    public int[][] onesMinusZeros(int[][] grid) {
3        int[] oner = new int[grid.length];
4        int[] onec = new int[grid[0].length];
5        int[][] matrix = new int[grid.length][grid[0].length];
6        for(int i=0; i<grid.length; i++){
7            for(int j=0; j<grid[0].length; j++){
8                if(grid[i][j] == 1){
9                    oner[i]++;
10                    onec[j]++;
11                }
12            }
13        }
14        for(int i=0; i<grid.length; i++){
15            int zero = grid[0].length - oner[i];
16            for(int j=0; j<grid[0].length; j++){
17                int zeroc = grid.length - onec[j];
18                matrix[i][j] = oner[i] + onec[j] - zero - zeroc;
19
20            }
21        }
22        return matrix;
23    }
24}