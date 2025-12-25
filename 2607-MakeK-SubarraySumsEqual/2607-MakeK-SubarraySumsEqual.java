// Last updated: 12/25/2025, 4:41:45 PM
1import java.util.*;
2
3class Solution {
4    public long makeSubKSumEqual(int[] arr, int k) {
5        int n = arr.length;
6        boolean[] visited = new boolean[n];
7        long ans = 0;
8
9        for (int i = 0; i < n; i++) {
10            if (visited[i]) continue;
11
12            int cnt = 0;
13            int j = i;
14
15            while (!visited[j]) {
16                visited[j] = true;
17                cnt++;
18                j = (j + k) % n;
19            }
20
21            int[] cycle = new int[cnt];
22            j = i;
23            int idx = 0;
24
25            while (idx < cnt) {
26                cycle[idx++] = arr[j];
27                j = (j + k) % n;
28            }
29
30            Arrays.sort(cycle);
31            int median = cycle[cnt / 2];
32
33            for (int val : cycle) {
34                ans += Math.abs(val - median);
35            }
36        }
37
38        return ans;
39    }
40}
41
42