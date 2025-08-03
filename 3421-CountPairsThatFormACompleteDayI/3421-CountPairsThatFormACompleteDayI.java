// Last updated: 8/3/2025, 9:52:47 AM
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for(int i = 0; i < hours.length ; i++)
            for(int j = i+1 ; j < hours.length ; j++) {
                if((hours[i] + hours[j]) % 24 == 0  ){
                   count++;
                }else{
                    continue;
                }
            }
            return count;
    }
}