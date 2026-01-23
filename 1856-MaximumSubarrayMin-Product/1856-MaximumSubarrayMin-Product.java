// Last updated: 1/23/2026, 1:27:06 PM
1class Solution {
2    public int maxSumMinProduct(int[] a) {
3        int n = a.length, M = 1_000_000_007;
4        long res = 0L;
5
6        //step 1; get prefixs um
7        long [] psum = new long[n + 1];
8        for(int i = 0; i < n; i++) psum[i+1] = psum[i] + a[i];
9
10        //step 2: get the left and right bound of each sub-array using mono deceasing & increasing stack
11        int[] s = new int[n];
12        int top = -1; // mono-decreasing for right bound
13        for (int i = 0; i <= n; s[++top] = i++)
14            while (top >= 0 && (i == n || a[i] < a[s[top]])) {
15                int min = a[s[top--]]; // get curMin value and poll current index out of stack, it's left and right bouldary is not determined
16                int l = top == -1 ? 0 : s[top] + 1; // use the prev idx to get left bound 
17                int r = i - 1; // right bound
18                res = Math.max(res, min * (psum[r+1] - psum[l]));
19            }
20
21        return (int) (res % M);
22    }
23}