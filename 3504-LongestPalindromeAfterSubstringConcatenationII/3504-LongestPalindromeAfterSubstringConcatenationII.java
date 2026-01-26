// Last updated: 1/26/2026, 11:48:49 AM
1class Solution {
2     static public int longestPalindrome(String s, String t) {
3        char[] arr1 = s.toCharArray();
4        char[] arr2 = t.toCharArray();
5        int n1 = arr1.length, n2 = arr2.length;
6        max = 0;
7
8        int[][] dp = new int[n1][n1];
9        int[] LCS1 = longestPalindromeSubstring(arr1, dp, n1);
10
11        dp = new int[n2][n2];
12        char[] temp = Arrays.copyOf(arr2, n2);
13
14        reverse(temp);
15        int[] LCS2 = longestPalindromeSubstring(temp, dp, n2);
16        reverse(LCS2);
17        
18        Integer[][][] dp2 = new Integer[n1][n2][2];
19        int ans = solve(0, n2 - 1, 0, arr1, arr2, LCS1, LCS2, dp2);
20        return Math.max(ans, max);
21    }
22
23    static int max = 0;
24
25    static int solve(int i, int j, int started, char[] arr1, char[] arr2, int[] LCS1, int[] LCS2, Integer[][][] dp) {
26        if (i == arr1.length || j < 0) {
27            int a = 0;
28            if (i < arr1.length) a = LCS1[i];
29            if (j >= 0) a = Math.max(a, LCS2[j]);
30            return a;
31        }
32        if (dp[i][j][started] != null) return dp[i][j][started];
33
34        int a = 0, b = 0, c = 0;
35        if (started == 0) {
36            b = solve(i, j - 1, 0, arr1, arr2, LCS1, LCS2, dp);
37            a = solve(i + 1, j, 0, arr1, arr2, LCS1, LCS2, dp);
38        }
39
40        if (arr1[i] == arr2[j]) {
41            c = 2 + solve(i + 1, j - 1, 1, arr1, arr2, LCS1, LCS2, dp);
42        } else {
43            c = Math.max(LCS1[i], LCS2[j]);
44        }
45        return dp[i][j][started] = Math.max(a, Math.max(c, b));
46    }
47
48    static int[] longestPalindromeSubstring(char[] arr, int[][] dp, int n) {
49        for (int i = 0; i < n; i++) {
50            for (int j = 0; j < n; j++) {
51                if (arr[i] == arr[j]) dp[i][j] = 1;
52            }
53        }
54
55        for (int i = n - 2; i >= 0; i--) {
56            for (int j = n - 1; j >= 1; j--) {
57                if (dp[i][j] == 1) dp[i][j] += dp[i + 1][j - 1];
58            }
59        }
60
61        int[] LCS1 = new int[n];
62        for (int i = 0; i < n; i++) {
63            for (int j = i, x = 0; j < n; j++, x++) {
64                if (Math.abs(dp[i][j] - dp[i + x][j - x]) == x) {
65                    LCS1[i] = Math.max(LCS1[i], x + 1);
66                    max = Math.max(max, x + 1);
67                }
68            }
69        }
70        return LCS1;
71    }
72
73    static void reverse(int[] arr) {
74        int i = 0, j = arr.length - 1;
75        while (i < j) {
76            int swap = arr[i];
77            arr[i] = arr[j];
78            arr[j] = swap;
79            i++;
80            j--;
81        }
82    }
83
84    static void reverse(char[] arr) {
85        int i = 0, j = arr.length - 1;
86        while (i < j) {
87            char swap = arr[i];
88            arr[i] = arr[j];
89            arr[j] = swap;
90            i++;
91            j--;
92        }
93    }
94}