// Last updated: 2/10/2026, 3:23:19 PM
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