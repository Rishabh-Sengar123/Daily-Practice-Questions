// Last updated: 2/10/2026, 3:18:15 PM
import java.util.*;

class Solution {
    int[] nums;
    int n;
    int[][] dp;
    int S;

    int solve(int l, int r) {
        if (l >= r) return 0;
        if (dp[l][r] != -1) return dp[l][r];

        int ans = 0;

        // First two
        if (l + 1 <= r && nums[l] + nums[l+1] == S) {
            ans = Math.max(ans, 1 + solve(l+2, r));
        }

        // Last two
        if (r - 1 >= l && nums[r] + nums[r-1] == S) {
            ans = Math.max(ans, 1 + solve(l, r-2));
        }

        // First and last
        if (nums[l] + nums[r] == S) {
            ans = Math.max(ans, 1 + solve(l+1, r-1));
        }

        return dp[l][r] = ans;
    }

    public int maxOperations(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        int ans = 0;

        // Try 3 possible initial scores
        int[] scores = {
            nums[0] + nums[1],
            nums[n-2] + nums[n-1],
            nums[0] + nums[n-1]
        };

        for (int sc : scores) {
            this.S = sc;
            dp = new int[n][n];
            for (int[] row : dp) Arrays.fill(row, -1);
            ans = Math.max(ans, solve(0, n-1));
        }

        return ans;
    }
}
