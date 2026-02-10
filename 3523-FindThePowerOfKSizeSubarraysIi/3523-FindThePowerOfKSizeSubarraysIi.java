// Last updated: 2/10/2026, 3:17:58 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        int[] bad = new int[n];
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                bad[i] = 1;
            }
        }

        int badCount = 0;
        for (int i = 1; i < k; i++) {
            badCount += bad[i];
        }
        res[0] = badCount == 0 ? nums[k - 1] : -1;

        for (int i = k; i < n; i++) {
            badCount += bad[i];
            badCount -= bad[i - k + 1];
            res[i - k + 1] = badCount == 0 ? nums[i] : -1;
        }

        return res;
    }
}
