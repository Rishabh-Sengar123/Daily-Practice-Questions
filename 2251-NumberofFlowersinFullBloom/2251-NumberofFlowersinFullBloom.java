// Last updated: 10/6/2025, 10:46:53 AM
class Solution {
    public int minPairSum(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        while(left < right){
            int ans = nums[left] + nums[right];
            left++;
            right--;
            max = Math.max(max, ans);
        }
        return max;
    }
}