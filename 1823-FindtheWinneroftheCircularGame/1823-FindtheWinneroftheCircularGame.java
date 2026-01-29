// Last updated: 1/29/2026, 10:38:39 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3    int ans = 0; // 0-indexed winner for n = 1
4    
5    for(int i = 2; i <= n; i++) {
6        ans = (ans + k) % i;
7    }
8    
9    return ans + 1; 
10}
11
12}