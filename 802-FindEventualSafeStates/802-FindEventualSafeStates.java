// Last updated: 1/8/2026, 8:03:23 PM
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        List<Integer> list = new ArrayList<>();
4        List<List<Integer>> reverse = new ArrayList<>();
5        for(int i=0; i<graph.length; i++){
6            reverse.add(new ArrayList<>());
7        }
8
9        for(int i=0; i<graph.length; i++){
10            for(int v : graph[i]){
11                reverse.get(v).add(i);
12            }
13        }
14        int[] indegree = new int[graph.length];
15        for(int i=0; i<graph.length; i++){
16            for(int j : reverse.get(i)){
17                indegree[j]++;
18            }
19        }
20        Queue<Integer> queue = new LinkedList<>();
21        for(int i=0; i<graph.length; i++){
22            if(indegree[i]==0){
23                queue.add(i);
24            }
25        }
26        while(!queue.isEmpty()){
27            int node = queue.poll();
28            list.add(node);
29            for(int i : reverse.get(node)){
30                indegree[i]--;
31                if(indegree[i] == 0){
32                    queue.add(i);
33                }
34            }
35        }
36        Collections.sort(list);
37        return list;
38    }
39}