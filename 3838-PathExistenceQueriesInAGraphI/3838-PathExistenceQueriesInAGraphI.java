// Last updated: 2/10/2026, 3:17:39 PM
class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        
        // Step 1: Build connected components
        int[] comp = new int[n];
        int compId = 0;
        comp[0] = 0;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                comp[i] = compId;  // same component
            } else {
                compId++;          // new component
                comp[i] = compId;
            }
        }
        
        // Step 2: Answer queries
        boolean[] ans = new boolean[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            ans[i] = (comp[u] == comp[v]);
        }
        
        return ans;
    }
}
