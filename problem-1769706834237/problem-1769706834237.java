// Last updated: 1/29/2026, 10:43:54 PM
1class Solution {
2    public int lastRemaining(int n) {
3    return solve(n);
4}
5
6private int solve(int n) {
7    if (n == 1) return 1;
8    return 2 * ((n / 2) + 1 - solve(n / 2));
9}
10
11}