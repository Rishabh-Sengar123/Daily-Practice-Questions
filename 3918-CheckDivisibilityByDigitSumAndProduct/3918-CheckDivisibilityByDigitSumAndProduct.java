// Last updated: 8/3/2025, 9:52:45 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int product = 1;
        int original = n;
        int sum = 0;
        boolean ans = false;
        while(n>0){
            int x = n%10;
            sum += x;
            product *= x;
            n /= 10;
        }
        if(original%(sum + product)==0){
            ans = true;
        }
        return ans;
    }
}