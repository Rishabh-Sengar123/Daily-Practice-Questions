// Last updated: 1/14/2026, 11:58:33 AM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        
4        // Step 1: Build connected components
5        int[] comp = new int[n];
6        int compId = 0;
7        comp[0] = 0;
8        
9        for (int i = 1; i < n; i++) {
10            if (nums[i] - nums[i - 1] <= maxDiff) {
11                comp[i] = compId;  // same component
12            } else {
13                compId++;          // new component
14                comp[i] = compId;
15            }
16        }
17        
18        // Step 2: Answer queries
19        boolean[] ans = new boolean[queries.length];
20        
21        for (int i = 0; i < queries.length; i++) {
22            int u = queries[i][0];
23            int v = queries[i][1];
24            ans[i] = (comp[u] == comp[v]);
25        }
26        
27        return ans;
28    }
29}
30