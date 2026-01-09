// Last updated: 1/9/2026, 7:30:58 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int count = 0;
4        int fresh = 0;
5        int row = grid.length;
6        int col = grid[0].length;
7        Queue<int[]> queue = new LinkedList<>();
8        for(int i=0; i<grid.length; i++){
9            for(int j = 0; j<grid[0].length; j++){
10                if(grid[i][j] == 2){
11                    queue.add(new int[]{i,j});
12                }else if(grid[i][j] == 1){
13                    fresh++;
14                }
15            }
16        }
17        if(fresh == 0){
18            return 0;
19        }
20        
21        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
22        while(!queue.isEmpty()){
23            boolean rotted = false;
24            int size = queue.size();
25            for(int i=0; i<size; i++){
26                int[] cell = queue.poll();
27
28                int r = cell[0];
29                int c = cell[1];
30
31                for(int[] d : dir){
32                    int nr = r + d[0];
33                    int nc = c + d[1];
34
35                    if(nr >= 0 && nc >= 0 && nc < grid[0].length && nr < grid.length && grid[nr][nc] == 1){
36                        grid[nr][nc] = 2;
37                        fresh--;
38                        rotted = true;
39                        queue.add(new int[]{nr, nc});
40                    }
41                }
42            }
43            if(rotted == true){
44                count++;
45            }
46        }
47        if(fresh == 0){
48            return count;
49        }else{
50            return -1;
51        }
52        
53    }
54}