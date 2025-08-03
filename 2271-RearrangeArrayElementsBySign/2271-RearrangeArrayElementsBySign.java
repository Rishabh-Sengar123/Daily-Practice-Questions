// Last updated: 8/3/2025, 9:53:22 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi = 0;
        int ni = 1;
        int sizes = nums.length;
        int[] result = new int[sizes];
        for(int i = 0; i < sizes; i++){
            if(nums[i] > 0){
                result[pi]=nums[i];
                pi += 2;
            }else{
                result[ni]=nums[i];
                ni += 2;
            }
        }
        return result;
    }
}