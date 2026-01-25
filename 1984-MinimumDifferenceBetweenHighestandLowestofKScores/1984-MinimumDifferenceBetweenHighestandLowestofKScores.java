// Last updated: 1/25/2026, 7:38:29 PM
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        int n = nums.length;
4        if (k == 1) return 0;
5
6        Arrays.sort(nums);
7        int min = Integer.MAX_VALUE;
8
9        for (int i = 0; i <= n - k; i++) {
10            int sum = 0;
11            for (int j = i + 1; j < i + k; j++) {
12                sum += nums[j] - nums[j - 1];
13            }
14            min = Math.min(min, sum);
15        }
16        return min;
17    }
18}
19