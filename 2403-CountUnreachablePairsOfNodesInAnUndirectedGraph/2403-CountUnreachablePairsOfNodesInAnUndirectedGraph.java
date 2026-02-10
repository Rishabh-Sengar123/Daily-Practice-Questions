// Last updated: 2/10/2026, 3:19:23 PM
class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }
        for(int[] d : edges){
            int u = d[0];
            int v = d[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        long total = (long)n * (n-1)/2;
        long reached = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                int size = bfs(i, list, visited);
                reached += (long)size*(size-1)/2;
            }
        }

        return total - reached;
    }
    private int bfs(int n , List<List<Integer>> list, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int count = 0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            visited[curr] = true;
            for(int nei : list.get(curr)){
                if(!visited[nei]){
                    queue.add(nei);
                    visited[nei] = true;
                }
            }

        }
        return count;
    }

}