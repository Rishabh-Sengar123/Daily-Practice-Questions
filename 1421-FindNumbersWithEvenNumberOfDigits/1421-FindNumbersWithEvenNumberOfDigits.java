// Last updated: 2/10/2026, 3:20:55 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            String s = String.valueOf(nums[i]);
            if(s.length()%2 == 0){
                count++;
            }
        }
        return count;
    }
}