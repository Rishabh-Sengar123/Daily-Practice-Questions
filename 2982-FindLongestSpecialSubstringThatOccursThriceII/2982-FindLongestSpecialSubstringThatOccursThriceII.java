// Last updated: 1/20/2026, 7:59:30 PM
1class Solution {
2    public int maximumLength(String s) {
3        int n = s.length();
4        int[][] freq = new int[26][n + 1];
5        char pre = s.charAt(0);
6
7        int len = 1;
8        freq[s.charAt(0) - 'a'][1] = 1;
9        int ans = -1;
10
11        for (int i = 1; i < n; i++) {
12            char cur = s.charAt(i);
13            if (cur == pre) {
14                len++;
15                int count = 1;
16                freq[cur - 'a'][len] += 1;
17            } else {
18                freq[cur - 'a'][1] += 1;
19                pre = cur;
20                len = 1;
21            }
22        }
23
24        for (int i = 0; i < 26; i++) {
25            int preSum = 0;
26            for (int j = n; j >= 1; j--) {
27                preSum += freq[i][j];
28                if (preSum >= 3) {
29                    ans = Math.max(ans, j);
30                    break;
31                }
32            }
33        }
34
35        return ans;
36    }
37}