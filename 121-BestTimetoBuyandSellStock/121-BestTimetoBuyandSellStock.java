// Last updated: 3/10/2026, 4:52:38 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = prices[0];
4        int profit = 0;
5        for(int i=1; i<prices.length; i++){
6            int cost = prices[i]-min;
7            profit = Math.max(cost, profit);
8            min = Math.min(min, prices[i]);
9        }
10        return profit;
11    }
12}