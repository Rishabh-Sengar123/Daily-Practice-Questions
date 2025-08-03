// Last updated: 8/3/2025, 9:52:41 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean [] placed=new boolean[fruits.length];
        int c=0;
        for(int i =0 ;i< fruits.length ; i++){
            for(int j=0; j< baskets.length ; j++){
                if(placed[j]==false && baskets[j]>=fruits[i]){
                c++;
                placed[j]=true;
                
                break;
                }
            }
        }
        return placed.length - c;
    }
}