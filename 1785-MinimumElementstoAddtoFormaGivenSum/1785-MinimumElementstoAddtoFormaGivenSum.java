// Last updated: 1/18/2026, 9:21:18 PM
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        
4        long sum = 0;
5        for(int x : nums) sum += x;
6        
7        long diff = Math.abs(goal - sum);
8        
9        // Greedy: take max possible contribution each time
10        int result = (int)((diff + limit - 1) / limit); // ceil division
11        
12        return result;
13    }
14}
15