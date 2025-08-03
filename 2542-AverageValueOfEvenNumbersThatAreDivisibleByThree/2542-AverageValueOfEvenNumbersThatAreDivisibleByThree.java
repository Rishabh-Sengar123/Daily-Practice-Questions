// Last updated: 8/3/2025, 9:53:08 AM
class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int love = 0;
        int cal = 0;
        for(int i =0; i < nums.length ; i++){
            if(nums[i] % 3 == 0 && nums[i]%2 == 0){
                count++;
                love += nums[i];
                cal = love / count;
            }
        }
        return cal;
        
    }
}