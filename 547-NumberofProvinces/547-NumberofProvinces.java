// Last updated: 12/30/2025, 10:40:39 AM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int provinces = 0;
6
7        for (int i = 0; i < n; i++){
8            if (!visited[i]) {  
9                dfs(isConnected, visited, i);
10                provinces++;
11            }
12        }
13        return provinces;
14    }
15
16    public void dfs(int[][] isConnected, boolean[] visited, int i) {
17        visited[i] = true;
18        for (int j = 0; j < isConnected.length; j++) {
19            if (isConnected[i][j] == 1 && !visited[j]) {
20                dfs(isConnected, visited, j);
21            }
22        }
23    }
24}