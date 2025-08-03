// Last updated: 8/3/2025, 9:54:13 AM
public class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        int[] cand1 = null, cand2 = null;

        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (parent[v] == 0) {
                parent[v] = u;
            } else {
               
                cand1 = new int[]{parent[v], v}; 
                cand2 = new int[]{u, v};          
                edge[1] = 0; 
            }
        }

      
        int[] root = new int[n + 1];
        for (int i = 1; i <= n; i++) root[i] = i;

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (v == 0) continue; 

            int pu = find(root, u);
            if (pu == v) {
                
                return cand1 == null ? edge : cand1;
            }
            root[v] = pu;
        }

        return cand2; 
    }

    private int find(int[] root, int u) {
        if (root[u] != u)
            root[u] = find(root, root[u]);
        return root[u];
    }
}
