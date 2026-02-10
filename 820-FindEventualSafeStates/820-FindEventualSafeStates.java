// Last updated: 2/10/2026, 3:21:58 PM
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> reverse = new ArrayList<>();
        for(int i=0; i<graph.length; i++){
            reverse.add(new ArrayList<>());
        }

        for(int i=0; i<graph.length; i++){
            for(int v : graph[i]){
                reverse.get(v).add(i);
            }
        }
        int[] indegree = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            for(int j : reverse.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            list.add(node);
            for(int i : reverse.get(node)){
                indegree[i]--;
                if(indegree[i] == 0){
                    queue.add(i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}