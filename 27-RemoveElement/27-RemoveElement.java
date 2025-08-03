// Last updated: 8/3/2025, 10:43:40 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0) return 0;

        int num = 0;
        for(int i =0; i < nums.length ; i++){
            if(nums[i] != val){
                nums[num] = nums[i];
                num++;
            }
        }
        return num;
    }
}