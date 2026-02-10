// Last updated: 2/10/2026, 3:21:27 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int count = 0;
        int fresh = 0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        
        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while(!queue.isEmpty()){
            boolean rotted = false;
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] cell = queue.poll();

                int r = cell[0];
                int c = cell[1];

                for(int[] d : dir){
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if(nr >= 0 && nc >= 0 && nc < grid[0].length && nr < grid.length && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        rotted = true;
                        queue.add(new int[]{nr, nc});
                    }
                }
            }
            if(rotted == true){
                count++;
            }
        }
        if(fresh == 0){
            return count;
        }else{
            return -1;
        }
        
    }
}