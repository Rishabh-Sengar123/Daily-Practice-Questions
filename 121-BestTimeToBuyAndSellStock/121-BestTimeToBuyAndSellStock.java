// Last updated: 8/3/2025, 10:42:57 AM
class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxprofit = 0;
        while(right < prices.length){
            if(prices[right]> prices[left]){
                int profit = prices[right]- prices[left];
                maxprofit = Math.max(maxprofit, profit);
            }else{
                left = right;
            }
            right++;
        }
        return maxprofit;
    }
}