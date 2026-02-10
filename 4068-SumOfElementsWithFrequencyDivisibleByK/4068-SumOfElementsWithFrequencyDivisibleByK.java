// Last updated: 2/10/2026, 3:17:18 PM
import java.util.*;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (int num : freq.keySet()) {
            int count = freq.get(num);
            if (count % k == 0) {
                sum += num * count;
            }
        }

        return sum;
    }
}
