// Last updated: 12/31/2025, 11:05:16 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList<>();
4        for(int i=0; i<numCourses; i++){
5            graph.add(new ArrayList<>());
6
7        }
8
9        int[] indegree = new int[numCourses];
10
11        for(int[] edge : prerequisites){
12            int u = edge[0];
13            int v = edge[1];
14
15            graph.get(u).add(v);
16
17            indegree[v]++;
18
19        }
20
21        Queue<Integer> queue = new LinkedList<>();
22        for(int i=0; i<numCourses; i++){
23            if(indegree[i] == 0){
24                queue.add(i);
25            }
26        }
27
28        ArrayList<Integer> topo = new ArrayList<>();
29
30        while(!queue.isEmpty()){
31            int node = queue.poll();
32            topo.add(node);
33            for(int neighbor : graph.get(node)){
34                indegree[neighbor]--;
35                if(indegree[neighbor] == 0){
36                    queue.add(neighbor);
37                }
38            }
39        }
40        if(topo.size() != numCourses){
41            return false;
42        }
43        
44        return true;
45    }
46}