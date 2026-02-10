// Last updated: 2/10/2026, 3:19:37 PM
class Solution {
    public int countCollisions(String directions) {
        int length = directions.length();
        int collisons = 0;
        for(int i=0 ; i<length ; i++){
            if(directions.charAt(i) != 'S'){
                collisons++;
            }
        }
        int i = 0;
        while(i < length && directions.charAt(i) == 'L'){
            collisons--;
            i++;
        }
        int j = length - 1;
        while(j>=0 && directions.charAt(j) == 'R'){
            collisons--;
            j--;
        }
        return collisons;
    }
}
