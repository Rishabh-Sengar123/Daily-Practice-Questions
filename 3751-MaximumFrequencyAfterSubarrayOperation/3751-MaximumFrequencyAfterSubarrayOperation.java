// Last updated: 2/10/2026, 3:17:50 PM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int kf = 0, ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int x : nums) m.put(x, m.getOrDefault(x, 0) + 1);
        kf = m.getOrDefault(k, 0);

        for (int v = 1; v <= 50; v++) {
            if (v == k) continue;
            int cur = 0, best = 0;
            for (int x : nums) {
                if (x == v) cur++;
                else if (x == k) cur--;
                if (cur < 0) cur = 0;
                if (cur > best) best = cur;
            }
            ans = Math.max(ans, best);
        }
        return kf + ans;
    }
}
