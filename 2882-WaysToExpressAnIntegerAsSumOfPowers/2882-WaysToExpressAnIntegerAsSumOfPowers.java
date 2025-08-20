// Last updated: 8/20/2025, 10:34:05 AM
import java.util.*;

public class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
        List<Integer> powersList = new ArrayList<>();
        int base = 1;
        while (true) {
            long val = (long) Math.pow(base, x);
            if (val > n) break;
            powersList.add((int) val);
            base++;
        }

        int m = powersList.size();
        int[] powers = new int[m];
        for (int i = 0; i < m; i++) powers[i] = powersList.get(i);

        // dp[i][t] means number of ways using first i powers to form sum t
        // We'll optimize space to dp[t] only (rolling array)
        int[] dp = new int[n + 1];
        dp[0] = 1;  // one way to form sum 0: empty set

        for (int i = 0; i < m; i++) {
            int power = powers[i];
            // go backwards to avoid reuse of same power
            for (int t = n; t >= power; t--) {
                dp[t] = (dp[t] + dp[t - power]) % MOD;
            }
        }

        return dp[n];
    }
}
