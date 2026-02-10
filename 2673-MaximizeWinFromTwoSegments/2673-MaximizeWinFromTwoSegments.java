// Last updated: 2/10/2026, 3:18:50 PM
class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        int[] count = new int[n];
        
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && prizePositions[j] - prizePositions[i] <= k) {
                j++;
            }
            count[i] = j - i;
        }
        
        int[] suffixMax = new int[n + 1];
        suffixMax[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], count[i]);
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int end = i + count[i];
            ans = Math.max(ans, count[i] + suffixMax[end]);
        }
        
        return ans;
    }
}
