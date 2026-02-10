// Last updated: 2/10/2026, 3:22:38 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }
    private void bfs(int start , int[][] isConnected, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int node = queue.poll();
            visited[node] = true;

            for(int nei = 0; nei < isConnected.length ; nei++){
                if(isConnected[node][nei] == 1 && !visited[nei]){
                    queue.add(nei);
                }
            }
        }
    }
}