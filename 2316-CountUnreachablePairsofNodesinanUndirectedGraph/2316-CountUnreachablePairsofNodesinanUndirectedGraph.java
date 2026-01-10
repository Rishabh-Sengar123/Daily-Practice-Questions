// Last updated: 1/10/2026, 9:50:30 AM
1class Solution {
2    public long countPairs(int n, int[][] edges) {
3        List<List<Integer>> list = new ArrayList<>();
4        for(int i=0; i<n; i++){
5            list.add(new ArrayList<>());
6        }
7        for(int[] d : edges){
8            int u = d[0];
9            int v = d[1];
10            list.get(u).add(v);
11            list.get(v).add(u);
12        }
13        boolean[] visited = new boolean[n];
14        long total = (long)n * (n-1)/2;
15        long reached = 0;
16        for(int i=0; i<n; i++){
17            if(!visited[i]){
18                int size = bfs(i, list, visited);
19                reached += (long)size*(size-1)/2;
20            }
21        }
22
23        return total - reached;
24    }
25    private int bfs(int n , List<List<Integer>> list, boolean[] visited){
26        Queue<Integer> queue = new LinkedList<>();
27        queue.offer(n);
28        int count = 0;
29        while(!queue.isEmpty()){
30            int curr = queue.poll();
31            count++;
32            visited[curr] = true;
33            for(int nei : list.get(curr)){
34                if(!visited[nei]){
35                    queue.add(nei);
36                    visited[nei] = true;
37                }
38            }
39
40        }
41        return count;
42    }
43
44}