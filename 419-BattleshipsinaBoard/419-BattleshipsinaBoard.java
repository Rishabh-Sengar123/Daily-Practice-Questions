// Last updated: 1/9/2026, 8:28:30 PM
1class Solution {
2    public int countBattleships(char[][] board) {
3        int count = 0;
4        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
5        for(int i=0; i<board.length; i++){
6            for(int j=0; j<board[0].length; j++){
7                if(board[i][j] == 'X'){
8                    count++;
9                    Queue<int[]> queue = new LinkedList<>();
10                    queue.add(new int[]{i,j});
11                    board[i][j] = '.';
12                    while(!queue.isEmpty()){
13                        int cell[] = queue.poll();
14                        int r = cell[0];
15                        int c = cell[1];
16
17                        for(int[] d : dir){
18                            int nr = r + d[0];
19                            int nc = c + d[1];
20
21                            if(nr>=0 && nc >= 0 && nc < board[0].length && nr < board.length && board[nr][nc] == 'X'){
22                                board[nr][nc] = '.';
23                                queue.add(new int[]{nr, nc});
24                            }
25                            
26                        }
27
28                    }
29
30                }
31            }
32        }
33        return count;
34    }
35}