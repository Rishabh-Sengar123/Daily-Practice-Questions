// Last updated: 10/5/2025, 6:16:57 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] remaining = new int[n];
        for (int i = 0; i < n; i++) {
            remaining[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(remaining);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (additionalRocks >= remaining[i]) {
                additionalRocks -= remaining[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
