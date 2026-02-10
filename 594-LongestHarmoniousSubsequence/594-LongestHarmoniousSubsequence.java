// Last updated: 2/10/2026, 3:22:31 PM
import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLen = Math.max(
                    maxLen,
                    map.get(key) + map.get(key + 1)
                );
            }
        }

        return maxLen;
    }
}
