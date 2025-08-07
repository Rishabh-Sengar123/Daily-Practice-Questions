// Last updated: 8/7/2025, 10:22:38 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        boolean ans = false;
        for(int i=0; i<50; i++){
            if(Math.pow(4, i)==n){
                ans = true;
                break;
            }
        }
        return ans;
    }
}