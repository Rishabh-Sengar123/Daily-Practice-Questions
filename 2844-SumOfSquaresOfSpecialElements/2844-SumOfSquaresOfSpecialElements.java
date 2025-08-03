// Last updated: 8/3/2025, 9:52:57 AM
class Solution {
    public int sumOfSquares(int[] nums) {
        int love = 0;
        int index = nums.length;
        for(int i = 1; i < index + 1 ; i++){
            if(index % i == 0){
                love += nums[i-1]*nums[i-1];
            }
            
        }
        return love;
    }
}