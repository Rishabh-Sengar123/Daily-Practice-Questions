// Last updated: 9/3/2025, 11:20:53 AM
import java.util.*;

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robber(nums, 0, dp);
    }

    public static int robber(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {  
            return dp[i];
        }

        int rob = nums[i] + robber(nums, i + 2, dp);
        int dontRob = robber(nums, i + 1, dp);

        dp[i] = Math.max(rob, dontRob);
        return dp[i];
    }
}
