// Last updated: 8/3/2025, 9:53:57 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int lo=1;
    Arrays.sort(piles);
    int leng = piles.length;
    int hi = piles[leng-1];
    
    int ans=0;
    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(ispossible(piles,h,mid)){
            ans=mid;
            hi=mid-1;
        }
        else
        {
          lo=mid+1;
        }
    }
    return ans;
    }
 public static boolean ispossible(int[] piles,int h,int mid){
    long sum=0;
    for(int i=0;i<piles.length;i++){
    sum+=(piles[i] / mid) + (piles[i] % mid != 0 ? 1 : 0);
    }
    return sum<=h;
 }
}