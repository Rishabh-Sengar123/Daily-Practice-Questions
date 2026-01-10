// Last updated: 1/10/2026, 10:17:22 AM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int[][] ans = new int[mat.length][mat[0].length];
4        int[][] dir  = {{1,0},{-1,0},{0,1},{0,-1}};
5        Queue<int[]> queue = new LinkedList<>();
6        for(int i=0; i<mat.length; i++){
7            for(int j = 0; j< mat[0].length; j++){
8                if(mat[i][j] == 0){
9                    ans[i][j] = 0;
10                    queue.add(new int[]{i,j});
11                }else{
12                    ans[i][j] = Integer.MAX_VALUE;
13                }
14            }
15        }
16        while(!queue.isEmpty()){
17            int[] cell = queue.poll();
18            int r = cell[0];
19            int c = cell[1];
20            for(int[] d : dir){
21                int dr = r + d[0];
22                int dc = c + d[1];
23                if(dr>=0 && dc>=0 && dc<mat[0].length && dr < mat.length){
24                    if(ans[dr][dc] > ans[r][c]+1){
25                        ans[dr][dc] = ans[r][c] + 1;
26                        queue.add(new int[]{dr,dc}); 
27                    }
28                }
29            }
30        }
31        return ans;
32
33    }
34}