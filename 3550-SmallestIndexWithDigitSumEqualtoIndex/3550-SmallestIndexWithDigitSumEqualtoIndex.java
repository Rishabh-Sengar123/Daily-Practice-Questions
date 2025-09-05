// Last updated: 9/5/2025, 2:54:59 PM
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