// Last updated: 2/10/2026, 3:20:54 PM
class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            indegree[v]++;
        }

        // ancestors list (your missing part)
        List<Set<Integer>> ancestors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ancestors.add(new TreeSet<>());
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // your BFS (topological)
        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : graph.get(node)) {

                // add direct ancestor
                ancestors.get(neighbor).add(node);

                // add ancestors of node
                ancestors.get(neighbor).addAll(ancestors.get(node));

                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // convert to required format
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>(ancestors.get(i)));
        }

        return result;
    }
}
