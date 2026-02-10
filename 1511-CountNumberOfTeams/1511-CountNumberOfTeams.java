// Last updated: 2/10/2026, 3:20:48 PM
class Solution {
    public int numTeams(int[] rating) {
        int total = 0;
        for(int i=1; i<rating.length-1; i++){
            int ls = 0;
            int lb = 0;
            int rs = 0;
            int rb = 0;
            for(int j=0; j<i; j++){
                if(rating[j]>rating[i]){
                    lb++;
                }else{
                    ls++;
                }
            }
            for(int j=i+1; j<rating.length ; j++){
                if(rating[i]>rating[j]){
                    rs++;
                }else{
                    rb++;
                }
            }
            int a = lb*rs;
            int b = ls*rb;

            total += a + b;
        }
        return total;
    }
}