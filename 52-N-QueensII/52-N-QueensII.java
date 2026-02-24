// Last updated: 2/24/2026, 2:50:03 PM
1class Solution {
2    private int count = 0;
3
4    public int totalNQueens(int n) {
5        boolean[] col = new boolean[n];
6        boolean[] diag1 = new boolean[2 * n - 1];
7        boolean[] diag2 = new boolean[2 * n - 1];
8
9        backtrack(0, n, col, diag1, diag2);
10        return count;
11    }
12
13    private void backtrack(int row, int n,
14                           boolean[] col,
15                           boolean[] diag1,
16                           boolean[] diag2) {
17
18        if (row == n) {
19            count++;
20            return;
21        }
22
23        for (int c = 0; c < n; c++) {
24
25            int d1 = row - c + n - 1;
26            int d2 = row + c;
27
28            if (col[c] || diag1[d1] || diag2[d2]) {
29                continue;
30            }
31
32            col[c] = true;
33            diag1[d1] = true;
34            diag2[d2] = true;
35
36            backtrack(row + 1, n, col, diag1, diag2);
37
38            col[c] = false;
39            diag1[d1] = false;
40            diag2[d2] = false;
41        }
42    }
43}