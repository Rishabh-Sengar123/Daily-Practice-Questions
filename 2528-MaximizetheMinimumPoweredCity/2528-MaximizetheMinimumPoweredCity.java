// Last updated: 1/30/2026, 1:06:50 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int ans = 0;
4        for(int i=2; i<=n; i++){
5            ans = (ans + k)%i;
6        }
7        return ans + 1;
8    }
9}