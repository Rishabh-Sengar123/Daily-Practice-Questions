// Last updated: 8/3/2025, 9:53:30 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while(r>l){
            int sum = nums[l]+nums[r];
            ans = Math.max(ans, sum);
            r--;
            l++;
        }
        return ans;
    }
}