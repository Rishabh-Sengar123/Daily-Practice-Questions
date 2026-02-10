// Last updated: 2/10/2026, 3:21:11 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2 != 0){
                count++;

            }else{
                count = 0;
            }

            if(count == 3){
                return true;
            }
        }
        return false;
    }
}