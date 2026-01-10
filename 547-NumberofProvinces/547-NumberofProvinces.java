// Last updated: 1/10/2026, 9:35:08 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int provinces = 0;
6        for(int i=0; i<n; i++){
7            if(!visited[i]){
8                bfs(i, isConnected, visited);
9                provinces++;
10            }
11        }
12        return provinces;
13    }
14    private void bfs(int start , int[][] isConnected, boolean[] visited){
15        Queue<Integer> queue = new LinkedList<>();
16        queue.add(start);
17        while(!queue.isEmpty()){
18            int node = queue.poll();
19            visited[node] = true;
20
21            for(int nei = 0; nei < isConnected.length ; nei++){
22                if(isConnected[node][nei] == 1 && !visited[nei]){
23                    queue.add(nei);
24                }
25            }
26        }
27    }
28}