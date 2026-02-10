// Last updated: 2/10/2026, 3:19:22 PM
import java.util.*;

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);

        Set<Integer> passSet = new HashSet<>();
        for (int p : passengers) passSet.add(p);

        int i = 0; 
        int m = passengers.length;
        int lastCount = 0;

        for (int b : buses) {
            int count = 0;
            while (i < m && passengers[i] <= b && count < capacity) {
                i++;
                count++;
            }
            lastCount = count; 
        }

        int lastBus = buses[buses.length - 1];
        int ans;

        if (lastCount < capacity) {
            ans = lastBus;
        } else {
            ans = passengers[i - 1] - 1;
        }

        while (passSet.contains(ans)) {
            ans--;
        }

        return ans;
    }
}
