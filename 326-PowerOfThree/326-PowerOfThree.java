// Last updated: 2/10/2026, 3:23:23 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        boolean ans = false;
        for(int i =0 ; i < 31; i++){
            if(Math.pow(3, i)==n){
                ans = true;
                
            }
        }
        return ans;
    }
}