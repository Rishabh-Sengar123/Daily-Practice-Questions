// Last updated: 1/27/2026, 2:17:46 PM
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        int n = edges.length;
4        
5        // Get distances from node1 to all reachable nodes using BFS
6        int[] dist1 = bfsDistances(edges, node1, n);
7        
8        // Get distances from node2 to all reachable nodes using BFS
9        int[] dist2 = bfsDistances(edges, node2, n);
10        
11        int minMaxDist = Integer.MAX_VALUE;
12        int result = -1;
13        
14        // Find the node with minimum maximum distance
15        for (int i = 0; i < n; i++) {
16            // Check if node i is reachable from both node1 and node2
17            if (dist1[i] != -1 && dist2[i] != -1) {
18                int maxDist = Math.max(dist1[i], dist2[i]);
19                
20                if (maxDist < minMaxDist) {
21                    minMaxDist = maxDist;
22                    result = i;
23                }
24            }
25        }
26        
27        return result;
28    }
29    
30    // BFS to find distances from start node
31    private int[] bfsDistances(int[] edges, int start, int n) {
32        int[] distances = new int[n];
33        Arrays.fill(distances, -1);
34        
35        Queue<Integer> queue = new LinkedList<>();
36        queue.offer(start);
37        distances[start] = 0;
38        
39        while (!queue.isEmpty()) {
40            int current = queue.poll();
41            int next = edges[current];
42            
43            // If there's an outgoing edge and we haven't visited the next node
44            if (next != -1 && distances[next] == -1) {
45                distances[next] = distances[current] + 1;
46                queue.offer(next);
47            }
48        }
49        
50        return distances;
51    }
52}