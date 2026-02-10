// Last updated: 2/10/2026, 3:20:14 PM
class Solution {

    static final int MOD = 1_000_000_007;
    List<List<int[]>> graph;
    long[] dist;
    Integer[] dp;

    public int countRestrictedPaths(int n, int[][] edges) {

        // STEP 1: Build graph
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        
        dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dijkstra(n);

      
        dp = new Integer[n + 1];
        return dfs(1, n);
    }

    private void dijkstra(int start) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );

        dist[start] = 0;
        pq.offer(new long[]{0, start});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];

            if (d > dist[u]) continue;

            for (int[] nei : graph.get(u)) {
                int v = nei[0];
                int w = nei[1];
                if (dist[v] > d + w) {
                    dist[v] = d + w;
                    pq.offer(new long[]{dist[v], v});
                }
            }
        }
    }

    private int dfs(int node, int n) {
        if (node == n) return 1;
        if (dp[node] != null) return dp[node];

        int ways = 0;
        for (int[] nei : graph.get(node)) {
            int v = nei[0];
            if (dist[v] < dist[node]) {
                ways = (ways + dfs(v, n)) % MOD;
            }
        }

        return dp[node] = ways;
    }
}
