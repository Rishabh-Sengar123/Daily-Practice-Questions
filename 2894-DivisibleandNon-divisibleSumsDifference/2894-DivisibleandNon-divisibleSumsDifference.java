// Last updated: 8/11/2025, 11:43:03 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int non = 0;
        int sum = 0;
        int diff = 0;
        for(int i=1; i<n+1; i++){
            if(i%m==0){
                sum += i;
            }else{
                non += i;
            }
        }
        diff = non - sum;
        return diff;
    }
}