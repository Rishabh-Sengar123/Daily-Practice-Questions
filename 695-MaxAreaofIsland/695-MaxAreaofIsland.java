// Last updated: 1/9/2026, 10:43:51 PM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        
4        int ans = 0;
5        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
6        for(int i=0; i<grid.length; i++){
7            for(int j=0; j<grid[0].length; j++){
8                if(grid[i][j] == 1){
9                    int count = 0;
10                    count++;
11                    Queue<int[]> queue = new LinkedList<>();
12                    queue.add(new int[]{i,j});
13                    grid[i][j] = 0;
14
15                    while(!queue.isEmpty()){
16                        int[] cell = queue.poll();
17                        int r = cell[0];
18                        int c = cell[1];
19
20                        for(int[] d : dir){
21                            int dr = r + d[0];
22                            int dc = c + d[1];
23                        
24                            if(dc>=0 && dr>=0 && dc < grid[0].length && dr < grid.length && grid[dr][dc] ==1){
25                                grid[dr][dc] = 0;
26                                queue.add(new int[]{dr,dc});
27                                count++;
28                                
29                            }
30                        }
31                    }
32                    ans = Math.max(ans, count);
33                }
34            }
35        }
36        return ans;
37    }
38}