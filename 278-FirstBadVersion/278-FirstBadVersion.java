// Last updated: 8/3/2025, 9:54:38 AM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int f = 1 , l = n;
        while(f<=l){
            int mid = f + (l-f)/2;
            if(!isBadVersion(mid)){
                f = mid+1;
            }else{
                l = mid -1 ;
            }
        }
        return f;

    }
}