// Last updated: 2/10/2026, 3:20:47 PM
class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] edges, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int[] edge : queries){
            ans.add(possible(graph, edge[0], edge[1]));
        }
        return ans;
    }
    public boolean possible(List<List<Integer>> graph, int src, int des){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        q.add(src);

        while(!q.isEmpty()){
            int node = q.poll();

            if(visited.contains(node)){
                continue;
            }
            visited.add(node);

            if(node == des){
                return true;
            
            }

            for(int nbrs:graph.get(node)){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }



        }
        return false;
    }
}