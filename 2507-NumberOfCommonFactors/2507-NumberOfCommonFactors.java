// Last updated: 8/3/2025, 9:53:10 AM
class Solution {
    public int commonFactors(int a, int b) {
        int ans = Math.min(a,b);
        int count = 0;
        for(int i = 1; i < ans+1; i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}