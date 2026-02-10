// Last updated: 2/10/2026, 3:18:45 PM
import java.util.*;

class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }

            boolean beautiful = true;
            for (int i = 0; i < subset.size(); i++) {
                for (int j = i + 1; j < subset.size(); j++) {
                    if (Math.abs(subset.get(i) - subset.get(j)) == k) {
                        beautiful = false;
                        break;
                    }
                }
                if (!beautiful) break;
            }

            if (beautiful) count++;
        }

        return count;
    }
}
