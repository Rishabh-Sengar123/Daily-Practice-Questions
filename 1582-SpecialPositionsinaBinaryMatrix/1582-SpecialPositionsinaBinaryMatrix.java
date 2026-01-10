// Last updated: 1/10/2026, 3:26:38 PM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int count = 0;
4        int n = mat.length;
5        int m = mat[0].length;
6        int[] row = new int[n];
7        int[] col = new int[m];
8        for(int i=0; i<n; i++){
9            for(int j=0; j<m; j++){
10                if(mat[i][j] == 1){
11                    row[i]++;
12                    col[j]++;
13                }
14            }
15        }
16        for(int i=0; i<n; i++){
17            for(int j=0; j<m; j++){
18                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
19                    count++;
20                }
21            }
22        }
23        return count;
24    }
25}