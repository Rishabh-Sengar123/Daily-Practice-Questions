// Last updated: 2/10/2026, 3:19:53 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(i, new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(source);
        while(!queue.isEmpty()){
            int node = queue.poll();

            if(visited.contains(node)){
                continue;
            }

            visited.add(node);

            if(node == destination){
                return true;
            }

            for(int neighbor : map.get(node)){
                if(!visited.contains(neighbor)){
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }    
}

// 