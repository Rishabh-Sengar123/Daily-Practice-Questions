// Last updated: 2/10/2026, 3:19:20 PM
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long minSumSquare = 0;
        int[] diffs = new int[100_001];
        long totalDiff = 0;
        long kSum = (long) k1 + k2;
        int maxDiff = 0;

        for (int i = 0; i < nums1.length; i++) {
            int currentDiff = Math.abs(nums1[i] - nums2[i]);
            if (currentDiff > 0) {
                totalDiff += currentDiff;
                diffs[currentDiff]++;
                maxDiff = Math.max(maxDiff, currentDiff);
            }
        }

        if (totalDiff <= kSum) return 0;

        for (int i = maxDiff; i > 0 && kSum > 0; i--) {
            if (diffs[i] == 0) continue;

            if (diffs[i] >= kSum) {
                diffs[i] -= kSum;
                diffs[i - 1] += kSum;
                kSum = 0;
            } else {
                diffs[i - 1] += diffs[i];
                kSum -= diffs[i];
                diffs[i] = 0;
            }
        }

        for (int i = 0; i <= maxDiff; i++) {
            if (diffs[i] > 0) {
                minSumSquare += 1L * i * i * diffs[i];
            }
        }

        return minSumSquare;
    }
}
