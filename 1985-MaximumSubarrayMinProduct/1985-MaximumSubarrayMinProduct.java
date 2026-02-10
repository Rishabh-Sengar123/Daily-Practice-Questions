// Last updated: 2/10/2026, 3:20:03 PM
class Solution {
    public int maxSumMinProduct(int[] a) {
        int n = a.length, M = 1_000_000_007;
        long res = 0, ps[] = new long[n + 1];

        for (int i = 0; i < n; i++)
            ps[i + 1] = ps[i] + a[i];

        int[] st = new int[n];
        int top = -1;

        for (int i = 0; i <= n; i++) {
            while (top >= 0 && (i == n || a[i] < a[st[top]])) {
                int min = a[st[top--]];
                int l = top < 0 ? 0 : st[top] + 1;
                res = Math.max(res, min * (ps[i] - ps[l]));
            }
            st[++top] = i;
        }

        return (int)(res % M);
    }
}
