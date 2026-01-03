// Last updated: 1/3/2026, 3:52:26 PM
1class Solution {
2    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
3        int[] indegree = new int[n];
4        for(List<Integer> edge : edges){
5            indegree[edge.get(1)]++; 
6        }
7        List<Integer> result = new ArrayList<>();
8        for(int i=0; i<n; i++){
9            if(indegree[i] == 0){
10                result.add(i);
11            }
12        }
13        return result;
14    }
15}