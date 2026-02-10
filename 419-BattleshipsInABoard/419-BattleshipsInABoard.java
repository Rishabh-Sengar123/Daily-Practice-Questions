// Last updated: 2/10/2026, 3:23:00 PM
class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'X'){
                    count++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i,j});
                    board[i][j] = '.';
                    while(!queue.isEmpty()){
                        int cell[] = queue.poll();
                        int r = cell[0];
                        int c = cell[1];

                        for(int[] d : dir){
                            int nr = r + d[0];
                            int nc = c + d[1];

                            if(nr>=0 && nc >= 0 && nc < board[0].length && nr < board.length && board[nr][nc] == 'X'){
                                board[nr][nc] = '.';
                                queue.add(new int[]{nr, nc});
                            }
                            
                        }

                    }

                }
            }
        }
        return count;
    }
}