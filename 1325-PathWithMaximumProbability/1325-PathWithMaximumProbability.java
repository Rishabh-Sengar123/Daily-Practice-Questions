// Last updated: 2/10/2026, 3:21:06 PM
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb,
                                 int start_node, int end_node) {

        // 1. Build graph
        List<List<double[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double w = succProb[i];

            graph.get(u).add(new double[]{v, w});
            graph.get(v).add(new double[]{u, w});
        }

        // 2. Max probability array
        double[] dist = new double[n];
        dist[start_node] = 1.0;

        // 3. Max heap (probability, node)
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])
        );

        pq.add(new double[]{1.0, start_node});

        // 4. Modified Dijkstra
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            double prob = curr[0];
            int u = (int) curr[1];

            if (prob < dist[u]) continue;

            for (double[] nei : graph.get(u)) {
                int v = (int) nei[0];
                double w = nei[1];

                double newProb = prob * w;
                if (newProb > dist[v]) {
                    dist[v] = newProb;
                    pq.add(new double[]{newProb, v});
                }
            }
        }

        return dist[end_node];
    }
}
