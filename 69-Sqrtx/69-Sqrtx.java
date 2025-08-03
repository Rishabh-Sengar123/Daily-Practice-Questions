// Last updated: 8/3/2025, 10:43:24 AM
class Solution {
    public int mySqrt(int x) {
        int lo = 0;
        int hi = x;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(Math.pow(mid,2)<=x){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
}