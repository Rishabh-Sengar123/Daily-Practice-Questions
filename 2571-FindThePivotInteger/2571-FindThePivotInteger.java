// Last updated: 8/3/2025, 9:53:06 AM
class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int sum = n*(n+1)/2;
        int sqrt = (int)Math.sqrt(sum);
        if(sqrt*sqrt==sum){
            return sqrt;
        }
        return -1;
    }
}