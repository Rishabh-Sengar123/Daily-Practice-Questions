// Last updated: 8/3/2025, 9:53:02 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i < hours.length ; i++ ){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
}