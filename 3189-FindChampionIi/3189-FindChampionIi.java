// Last updated: 2/10/2026, 3:18:23 PM
class Solution {
    public int findChampion(int n, int[][] edges) {
        // List<List<Integer>> graph = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     graph.add(new ArrayList<>());
        // }

        // for(int[] edge : edges){
        //     int u = edge[0];
        //     int v = edge[1];

        //     graph.get(u).add(v);
        // }
        int[] indegree = new int[n];
        for(int[] edge : edges){
            indegree[edge[1]]++;
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(indegree[i]==0){
                count++;
            }
        }

        
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0 && count == 1){
                return i;
            }
        } 

    return -1;
    }
}