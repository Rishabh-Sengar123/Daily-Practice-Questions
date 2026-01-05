// Last updated: 1/5/2026, 9:23:09 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int totalMoves = m + n - 2;
5        int downMoves = m - 1;
6
7        long result = 1;
8
9        for (int i = 1; i <= downMoves; i++) {
10            result = result * (totalMoves - downMoves + i) / i;
11        }
12
13        return (int) result;
14    }
15}
16