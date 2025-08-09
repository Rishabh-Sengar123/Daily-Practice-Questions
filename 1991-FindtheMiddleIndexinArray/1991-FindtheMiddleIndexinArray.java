// Last updated: 8/9/2025, 10:19:22 AM
class Solution {
    public int findMiddleIndex(int[] nums) {
    int total = 0, left = 0;
    for (int n : nums) total += n;
    for (int i = 0; i < nums.length; i++) {
        if (left == total - left - nums[i]) return i;
        left += nums[i];
    }
    return -1;
}

}