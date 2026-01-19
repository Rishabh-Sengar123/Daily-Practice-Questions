// Last updated: 1/19/2026, 10:39:04 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList<>();
4        for(int i=0; i<numCourses; i++){
5            graph.add(new ArrayList<>());
6        }
7        int[] indegree = new int[numCourses];
8        for(int[] e : prerequisites){
9            int u = e[0];
10            int v = e[1];
11
12            graph.get(u).add(v);
13
14            indegree[v]++;
15        }
16        ArrayList<Integer> topo = new ArrayList<>();
17        Queue<Integer> queue = new LinkedList<>();
18        for(int i=0; i<numCourses; i++){
19            if(indegree[i] == 0){
20                queue.add(i);
21
22            }
23        }
24        while(!queue.isEmpty()){
25            int node = queue.poll();
26            topo.add(node);
27
28            for(int neighbor : graph.get(node)){
29                indegree[neighbor]--;
30                if(indegree[neighbor] == 0){
31                    queue.add(neighbor);
32                }
33            }
34        }
35        if(topo.size() != numCourses){
36            return false;
37        }
38
39        return true;
40    }
41}