// Last updated: 1/19/2026, 10:49:53 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count = 0;
4        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
5        for(int i=0; i<grid.length; i++){
6            for(int j=0; j<grid[0].length; j++){
7                if(grid[i][j] == '1'){
8                    grid[i][j] = '0';
9                    count++;
10                    Queue<int[]> queue = new LinkedList<>();
11
12                    queue.add(new int[]{i,j});
13                    while(!queue.isEmpty()){
14                        int[] curr = queue.poll();
15                        int r = curr[0];
16                        int c = curr[1];
17
18                        for(int[] d : dir){
19                            int dr = d[0] + r;
20                            int dc = d[1] + c;
21
22                            if(dr>=0 && dc>=0 && dr<grid.length && dc<grid[0].length && grid[dr][dc] == '1'){
23                                grid[dr][dc] = '.';
24                                queue.add(new int[]{dr,dc});
25                            }
26                        }
27                    }
28
29                }
30            }
31        }
32        return count;
33    }
34}