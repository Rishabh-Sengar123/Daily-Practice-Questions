// Last updated: 2/10/2026, 3:19:55 PM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if (k == 1) return 0;

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i + 1; j < i + k; j++) {
                sum += nums[j] - nums[j - 1];
            }
            min = Math.min(min, sum);
        }
        return min;
    }
}
