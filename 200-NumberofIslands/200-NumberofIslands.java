// Last updated: 1/9/2026, 8:42:05 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count = 0;
4        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
5        for(int i=0; i<grid.length ; i++){
6            for(int j =0 ; j<grid[0].length; j++){
7                if(grid[i][j] == '1'){
8                    count++;
9                    Queue<int[]> queue = new LinkedList<>();
10                    queue.add(new int[]{i,j});
11                    grid[i][j] = '0';
12                    while(!queue.isEmpty()){
13                        int[] cell = queue.poll();
14                        int r = cell[0];
15                        int c = cell[1];
16
17                        for(int[] d : dir){
18                            int dr = r + d[0];
19                            int dc = c + d[1];
20
21                            if(dc>=0 && dr>=0 && dc<grid[0].length && dr < grid.length && grid[dr][dc] == '1'){
22                                grid[dr][dc] = '.';
23                                queue.add(new int[]{dr,dc});
24                            }
25                        }
26                    }
27                }
28            }
29        }
30        return count;
31    }
32}