// Last updated: 2/10/2026, 3:19:18 PM
class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        
        // Get distances from node1 to all reachable nodes using BFS
        int[] dist1 = bfsDistances(edges, node1, n);
        
        // Get distances from node2 to all reachable nodes using BFS
        int[] dist2 = bfsDistances(edges, node2, n);
        
        int minMaxDist = Integer.MAX_VALUE;
        int result = -1;
        
        // Find the node with minimum maximum distance
        for (int i = 0; i < n; i++) {
            // Check if node i is reachable from both node1 and node2
            if (dist1[i] != -1 && dist2[i] != -1) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                
                if (maxDist < minMaxDist) {
                    minMaxDist = maxDist;
                    result = i;
                }
            }
        }
        
        return result;
    }
    
    // BFS to find distances from start node
    private int[] bfsDistances(int[] edges, int start, int n) {
        int[] distances = new int[n];
        Arrays.fill(distances, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        distances[start] = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int next = edges[current];
            
            // If there's an outgoing edge and we haven't visited the next node
            if (next != -1 && distances[next] == -1) {
                distances[next] = distances[current] + 1;
                queue.offer(next);
            }
        }
        
        return distances;
    }
}