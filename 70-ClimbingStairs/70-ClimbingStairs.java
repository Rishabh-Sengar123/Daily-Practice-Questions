// Last updated: 9/23/2025, 10:00:17 PM
class Solution {
    public int climbStairs(int n) {
        if(n==1 ||n==2){
            return n;
        }
        int a = 1;
        int b = 2;
        for(int i = 3; i <= n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}