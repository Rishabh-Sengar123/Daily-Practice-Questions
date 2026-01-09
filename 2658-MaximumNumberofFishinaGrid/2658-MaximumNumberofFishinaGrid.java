// Last updated: 1/9/2026, 11:03:12 PM
1class Solution {
2    public int findMaxFish(int[][] grid) {
3        int ans = 0;
4        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
5        for(int i=0; i<grid.length; i++){
6            for(int j=0; j<grid[0].length; j++){
7                if(grid[i][j] != 0){
8                    int count = grid[i][j];
9                    grid[i][j] = 0;
10                    Queue<int[]> queue = new LinkedList<>();
11                    queue.add(new int[]{i,j});
12
13                    while(!queue.isEmpty()){
14                        int[] cell = queue.poll();
15                        int r = cell[0];
16                        int c = cell[1];
17
18                        for(int[] d : dir){
19                            int dr = r + d[0];
20                            int dc = c + d[1];
21
22                            if(dc>=0 && dr>=0 && dc<grid[0].length && dr<grid.length && grid[dr][dc] != 0){
23                                count += grid[dr][dc];
24                                grid[dr][dc] = 0;
25                                queue.add(new int[]{dr, dc});
26                            }
27                        }
28                    }
29                    ans = Math.max(ans , count);
30                }
31            }
32        }
33        return ans;
34    }
35}