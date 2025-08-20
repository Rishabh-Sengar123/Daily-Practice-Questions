// Last updated: 8/20/2025, 10:35:05 AM
public class Solution{
public int pivotIndex(int[] nums) {
    int total = 0, left = 0;
    for (int n : nums) total += n;
    for (int i = 0; i < nums.length; i++) {
        if (left == total - left - nums[i]) return i;
        left += nums[i];
    }
    return -1;
}
}
