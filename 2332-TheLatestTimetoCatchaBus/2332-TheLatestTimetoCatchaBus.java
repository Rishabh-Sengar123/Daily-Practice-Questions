// Last updated: 2/4/2026, 6:55:51 PM
1import java.util.*;
2
3class Solution {
4    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
5        Arrays.sort(buses);
6        Arrays.sort(passengers);
7
8        Set<Integer> passSet = new HashSet<>();
9        for (int p : passengers) passSet.add(p);
10
11        int i = 0; 
12        int m = passengers.length;
13        int lastCount = 0;
14
15        for (int b : buses) {
16            int count = 0;
17            while (i < m && passengers[i] <= b && count < capacity) {
18                i++;
19                count++;
20            }
21            lastCount = count; 
22        }
23
24        int lastBus = buses[buses.length - 1];
25        int ans;
26
27        if (lastCount < capacity) {
28            ans = lastBus;
29        } else {
30            ans = passengers[i - 1] - 1;
31        }
32
33        while (passSet.contains(ans)) {
34            ans--;
35        }
36
37        return ans;
38    }
39}
40