// Last updated: 1/30/2026, 12:52:56 PM
1class Solution {
2    public long maxPower(int[] stations, int r, int k) {
3        int n = stations.length;
4        long left = 0, right = k;
5        for (int x : stations)
6            right += x;
7
8        long[] v = new long[n];
9        while (left <= right) {
10            long x = (left + right) / 2;
11            for (int i = 0; i < n; ++i)
12                v[i] = stations[i];
13
14            long s = 0, use = 0;
15            for (int i = 0; i < r; ++i)
16                s += v[i];
17
18            for (int i = 0; i < n; ++i) {
19                int t = Math.min(n - 1, i + r);
20                if (i + r < n) s += v[i + r];
21                if (i - r > 0) s -= v[i - r - 1];
22                long diff = Math.max(0, x - s);
23                v[t] += diff;
24                s += diff;
25                use += diff;
26            }
27
28            if (use <= k) left = x + 1;
29            else right = x - 1;
30        }
31        return right;
32    }
33}