// Last updated: 1/9/2026, 11:23:28 PM
1class Solution {
2    public int countIslands(int[][] grid, int k) {
3        int ans = 0;
4        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
5
6        for(int i=0; i<grid.length; i++){
7            for(int j=0; j<grid[0].length; j++){
8                if(grid[i][j] != 0){
9                    long count = grid[i][j];
10                    grid[i][j] = 0;
11                    Queue<int[]> queue = new LinkedList<>();
12                    queue.add(new int[]{i,j});
13
14                    while(!queue.isEmpty()){
15                        int[] cell = queue.poll();
16                        int r = cell[0];
17                        int c = cell[1];
18
19                        for(int[] d : dir){
20                            int dr = r + d[0];
21                            int dc = c + d[1];
22                            if(dc>=0 && dr>=0 && dc < grid[0].length && dr < grid.length && grid[dr][dc] != 0){
23                                count += grid[dr][dc];
24                                grid[dr][dc] = 0;
25                                queue.add(new int[]{dr,dc});
26                            }
27                        }
28                    }
29                    if(k!=0 && count%k == 0){
30                        ans++;
31                    }
32
33                }
34            }
35        }
36        return ans;
37    }
38}