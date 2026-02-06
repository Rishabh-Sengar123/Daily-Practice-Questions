// Last updated: 2/6/2026, 10:13:27 AM
1class Solution {
2        public int totalSteps(int[] A) {
3        int n = A.length, res = 0, j = -1;
4        int[] dp = new int[n], stack = new int[n];
5        for(int i=n-1; i>=0; i--){
6            while(j>=0 && A[i]>A[stack[j]]){
7                dp[i] = Math.max(++dp[i], dp[stack[j--]]);
8                res = Math.max(res, dp[i]);
9            }
10            stack[++j] = i;
11        } 
12        return res;
13    }
14}