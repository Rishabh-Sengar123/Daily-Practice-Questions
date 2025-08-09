// Last updated: 8/9/2025, 10:08:13 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans = false;
        if(n%2!=0 && n!=1){
            return ans;
        }
        for(int i = 0; i < 100; i++){
            if(Math.pow(2,i)==n){
                ans = true;
            }
        }
        return ans;
    }
}