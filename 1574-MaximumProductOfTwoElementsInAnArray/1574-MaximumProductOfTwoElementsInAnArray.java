// Last updated: 8/3/2025, 9:53:41 AM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length;
        int love = 0;

        int sc = nums[index-2] - 1;
        int l = nums[index-1] -1 ;
        love = sc*l;
        return love;
        
    }
    
}