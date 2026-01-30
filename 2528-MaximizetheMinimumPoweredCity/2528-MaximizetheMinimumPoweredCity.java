// Last updated: 1/30/2026, 1:13:04 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int time = 0;
4        int target = tickets[k];
5        
6        for (int i = 0; i < tickets.length; i++) {
7            if (i <= k) {
8                time += Math.min(tickets[i], target);
9            } else {
10                time += Math.min(tickets[i], target - 1);
11            }
12        }
13        
14        return time;
15    }
16}