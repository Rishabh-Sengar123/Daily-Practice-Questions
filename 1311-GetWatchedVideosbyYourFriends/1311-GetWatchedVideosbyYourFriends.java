// Last updated: 1/1/2026, 11:53:29 AM
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] edges, int[][] queries) {
3        List<List<Integer>> graph = new ArrayList<>();
4        for(int i=0; i<numCourses; i++){
5            graph.add(new ArrayList<>());
6        }
7        for(int[] edge : edges){
8            int u = edge[0];
9            int v = edge[1];
10            graph.get(u).add(v);
11        }
12        List<Boolean> ans = new ArrayList<>();
13        for(int[] edge : queries){
14            ans.add(possible(graph, edge[0], edge[1]));
15        }
16        return ans;
17    }
18    public boolean possible(List<List<Integer>> graph, int src, int des){
19        Queue<Integer> q = new LinkedList<>();
20        HashSet<Integer> visited = new HashSet<>();
21
22        q.add(src);
23
24        while(!q.isEmpty()){
25            int node = q.poll();
26
27            if(visited.contains(node)){
28                continue;
29            }
30            visited.add(node);
31
32            if(node == des){
33                return true;
34            
35            }
36
37            for(int nbrs:graph.get(node)){
38                if(!visited.contains(nbrs)){
39                    q.add(nbrs);
40                }
41            }
42
43
44
45        }
46        return false;
47    }
48}