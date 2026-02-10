// Last updated: 2/10/2026, 3:22:28 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product = 1;
        int ans = Integer.MIN_VALUE;
        int hello = nums[0]*nums[1]*nums[nums.length-1];
        for(int i=0; i<nums.length - 2; i++){
            product = nums[i]*nums[i+1]*nums[i+2];
            ans = Math.max(ans , product);
            ans = Math.max(ans , hello);

        }
        return ans;
    }

}