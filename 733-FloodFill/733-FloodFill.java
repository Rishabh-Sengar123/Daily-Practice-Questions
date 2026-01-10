// Last updated: 1/10/2026, 3:52:43 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int original = image[sr][sc];
4        if(original == color){
5            return image;
6        }
7        int[][] dir =  {{1,0},{-1,0},{0,1},{0,-1}};
8        Queue<int[]> queue = new LinkedList<>();
9        queue.add(new int[]{sr,sc});
10        image[sr][sc] = color;
11        while(!queue.isEmpty()){
12            int[] cell = queue.poll();
13            int r = cell[0];
14            int c = cell[1];
15            for(int[] d : dir){
16                int dr = r + d[0];
17                int dc = c + d[1];
18
19                if(dr>=0 && dc>=0 && dr<image.length && dc<image[0].length && image[dr][dc] == original){
20                    image[dr][dc] = color;
21                    queue.add(new int[]{dr,dc});
22                }
23            }
24        }
25        return image;
26    }
27}