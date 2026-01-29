// Last updated: 1/29/2026, 12:06:53 PM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int tupleSameProduct(int[] nums) {
6        int n = nums.length;
7        Map<Integer, Integer> productFrequency = new HashMap<>();
8
9        for (int i = 0; i < n; i++) {
10            for (int j = i + 1; j < n; j++) {
11                int product = nums[i] * nums[j];
12                productFrequency.merge(product, 1, Integer::sum);
13            }
14        }
15
16        int totalTuples = 0;
17        for (int frequency : productFrequency.values()) {
18            if (frequency >= 2) {
19                totalTuples += (frequency * (frequency - 1) / 2) * 8;
20            }
21        }
22
23        return totalTuples;
24    }
25}
26