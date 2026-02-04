// Last updated: 2/4/2026, 7:10:25 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        List<List<int[]>> adj = new ArrayList<>();
4        for(int i=0; i<n; i++){
5            adj.add(new ArrayList<>());
6        }
7        for(int[] e : edges){
8            int u = e[0];
9            int v = e[1];
10            int w = e[2];
11            adj.get(u).add(new int[]{v,w});
12            adj.get(v).add(new int[]{u,w});
13        }
14        int[] dist = new int[n];
15        Arrays.fill(dist, Integer.MAX_VALUE);
16        dist[0] = 0;
17        PriorityQueue<int[]> pq = new PriorityQueue<>(
18            (a, b) -> Integer.compare(a[0], b[0])
19        );
20
21        pq.offer(new int[]{0,0});
22        while (!pq.isEmpty()) {
23            int[] current = pq.poll();
24            int time = current[0];
25            int node = current[1];
26            
27            if (time > dist[node]) continue;
28            
29            for (int[] neighbor : adj.get(node)) {
30                int nextNode = neighbor[0];
31                int weight = neighbor[1];
32                
33                int newTime = time + weight;
34                
35              
36                if (newTime < dist[nextNode] && newTime < disappear[nextNode]) {
37                    dist[nextNode] = newTime;
38                    pq.offer(new int[]{newTime, nextNode});
39                }
40            }
41        }
42        
43        for (int i = 0; i < n; i++) {
44            if (dist[i] == Integer.MAX_VALUE) {
45                dist[i] = -1;
46            }
47        }
48        
49        return dist;
50    }
51}