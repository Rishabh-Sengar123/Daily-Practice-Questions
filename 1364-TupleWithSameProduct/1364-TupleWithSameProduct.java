// Last updated: 2/10/2026, 3:21:00 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> productFrequency = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productFrequency.merge(product, 1, Integer::sum);
            }
        }

        int totalTuples = 0;
        for (int frequency : productFrequency.values()) {
            if (frequency >= 2) {
                totalTuples += (frequency * (frequency - 1) / 2) * 8;
            }
        }

        return totalTuples;
    }
}
