// Last updated: 2/10/2026, 3:17:35 PM
/*
Author : Rishabh Sengar
*/

class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length ; i++){
            if(rj(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    private int rj(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }
        return sum;

    }
}