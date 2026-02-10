// Last updated: 2/10/2026, 3:17:41 PM
class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != 0){
                    //668 Test case fail due to huge input
                    long count = grid[i][j];
                    grid[i][j] = 0;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i,j});

                    while(!queue.isEmpty()){
                        int[] cell = queue.poll();
                        int r = cell[0];
                        int c = cell[1];

                        for(int[] d : dir){
                            int dr = r + d[0];
                            int dc = c + d[1];
                            if(dc>=0 && dr>=0 && dc < grid[0].length && dr < grid.length && grid[dr][dc] != 0){
                                count += grid[dr][dc];
                                grid[dr][dc] = 0;
                                queue.add(new int[]{dr,dc});
                            }
                        }
                    }
                    if(k!=0 && count%k == 0){
                        ans++;
                    }

                }
            }
        }
        return ans;
    }
}