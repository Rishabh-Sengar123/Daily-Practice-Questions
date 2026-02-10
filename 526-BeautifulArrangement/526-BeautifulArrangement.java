// Last updated: 2/10/2026, 3:22:41 PM
import java.util.*;

class Solution {
    public int countArrangement(int n) {
        int size = 1 << n; // total bitmask combinations (2^n)
        int[][] dp = new int[n + 1][size];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(n, 1, 0, dp);
    }

    private int helper(int n, int pos, int mask, int[][] dp) {
        if (pos > n) return 1; // all positions filled

        if (dp[pos][mask] != -1) return dp[pos][mask];

        int count = 0;
        for (int num = 1; num <= n; num++) {
            int bit = 1 << (num - 1);
            if ((mask & bit) == 0) { // not used
                if (num % pos == 0 || pos % num == 0) {
                    count += helper(n, pos + 1, mask | bit, dp);
                }
            }
        }

        dp[pos][mask] = count;
        return count;
    }
}

