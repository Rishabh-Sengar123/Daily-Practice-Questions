// Last updated: 8/3/2025, 9:53:03 AM
import java.util.*;

public class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int num : basket1) freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (int num : basket2) freq.put(num, freq.getOrDefault(num, 0) - 1);
        
        List<Integer> extras = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int value = entry.getValue();
            if (value % 2 != 0) return -1; // Impossible
            for (int i = 0; i < Math.abs(value) / 2; i++) {
                extras.add(entry.getKey());
            }
        }

        Collections.sort(extras);
        long minVal = Collections.min(Arrays.asList(Arrays.stream(basket1).boxed().toArray(Integer[]::new)));
        minVal = Math.min(minVal, Collections.min(Arrays.asList(Arrays.stream(basket2).boxed().toArray(Integer[]::new))));

        long cost = 0;
        for (int i = 0; i < extras.size() / 2; i++) {
            cost += Math.min(extras.get(i), 2 * minVal);
        }

        return cost;
    }
}
