// Last updated: 2/10/2026, 3:22:17 PM
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int ans = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    int count = 0;
                    count++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i,j});
                    grid[i][j] = 0;

                    while(!queue.isEmpty()){
                        int[] cell = queue.poll();
                        int r = cell[0];
                        int c = cell[1];

                        for(int[] d : dir){
                            int dr = r + d[0];
                            int dc = c + d[1];
                        
                            if(dc>=0 && dr>=0 && dc < grid[0].length && dr < grid.length && grid[dr][dc] ==1){
                                grid[dr][dc] = 0;
                                queue.add(new int[]{dr,dc});
                                count++;
                                
                            }
                        }
                    }
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }
}