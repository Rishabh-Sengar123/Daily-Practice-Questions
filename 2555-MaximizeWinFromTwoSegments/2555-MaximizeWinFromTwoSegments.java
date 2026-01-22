// Last updated: 1/22/2026, 7:49:25 PM
1class Solution {
2    public int maximizeWin(int[] prizePositions, int k) {
3        int n = prizePositions.length;
4        int[] count = new int[n];
5        
6        int j = 0;
7        for (int i = 0; i < n; i++) {
8            while (j < n && prizePositions[j] - prizePositions[i] <= k) {
9                j++;
10            }
11            count[i] = j - i;
12        }
13        
14        int[] suffixMax = new int[n + 1];
15        suffixMax[n] = 0;
16        for (int i = n - 1; i >= 0; i--) {
17            suffixMax[i] = Math.max(suffixMax[i + 1], count[i]);
18        }
19        
20        int ans = 0;
21        for (int i = 0; i < n; i++) {
22            int end = i + count[i];
23            ans = Math.max(ans, count[i] + suffixMax[end]);
24        }
25        
26        return ans;
27    }
28}
29