// Last updated: 8/7/2025, 10:20:56 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        boolean ans = false;
        for(int i =0 ; i < 31; i++){
            if(Math.pow(3, i)==n){
                ans = true;
                break;
            }
        }
        return ans;
    }
}