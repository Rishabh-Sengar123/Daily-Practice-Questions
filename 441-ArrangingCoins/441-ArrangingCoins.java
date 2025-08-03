// Last updated: 8/3/2025, 9:54:21 AM
class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        for(int i=1;i<n;i++){
            if(n-i>=i+1){
                count++;
                n=n-i;
            }
        }
        return count;
    }
}