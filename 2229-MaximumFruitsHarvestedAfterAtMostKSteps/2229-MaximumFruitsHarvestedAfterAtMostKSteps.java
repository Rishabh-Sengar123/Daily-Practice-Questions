// Last updated: 8/3/2025, 9:53:25 AM
class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int maxFruits = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += fruits[right][1];

            while (left <= right && !isReachable(fruits, left, right, startPos, k)) {
                sum -= fruits[left][1];
                left++;
            }

            maxFruits = Math.max(maxFruits, sum);
        }

        return maxFruits;
    }

    private boolean isReachable(int[][] fruits, int left, int right, int startPos, int k) {
        int leftPos = fruits[left][0];
        int rightPos = fruits[right][0];

        int leftFirstSteps = Math.abs(startPos - leftPos) + (rightPos - leftPos);
        int rightFirstSteps = Math.abs(startPos - rightPos) + (rightPos - leftPos);

        return Math.min(leftFirstSteps, rightFirstSteps) <= k;
    }
}

