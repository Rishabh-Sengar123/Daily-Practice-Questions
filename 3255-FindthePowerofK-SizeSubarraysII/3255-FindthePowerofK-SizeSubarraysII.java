// Last updated: 12/28/2025, 8:51:41 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n = nums.length;
4        int[] res = new int[n - k + 1];
5
6        int[] bad = new int[n];
7        for (int i = 1; i < n; i++) {
8            if (nums[i] != nums[i - 1] + 1) {
9                bad[i] = 1;
10            }
11        }
12
13        int badCount = 0;
14        for (int i = 1; i < k; i++) {
15            badCount += bad[i];
16        }
17        res[0] = badCount == 0 ? nums[k - 1] : -1;
18
19        for (int i = k; i < n; i++) {
20            badCount += bad[i];
21            badCount -= bad[i - k + 1];
22            res[i - k + 1] = badCount == 0 ? nums[i] : -1;
23        }
24
25        return res;
26    }
27}
28