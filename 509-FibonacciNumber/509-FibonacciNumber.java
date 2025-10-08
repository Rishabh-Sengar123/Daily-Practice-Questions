// Last updated: 10/9/2025, 12:20:41 AM
class Solution {
    public int fib(int n) {
        return solve(n);
    }

    public static int solve(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
