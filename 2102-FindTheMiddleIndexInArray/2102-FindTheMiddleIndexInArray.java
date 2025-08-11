// Last updated: 8/11/2025, 11:54:16 PM
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