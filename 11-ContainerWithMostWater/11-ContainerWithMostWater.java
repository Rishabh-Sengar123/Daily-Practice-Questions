// Last updated: 8/3/2025, 10:43:57 AM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while(right > left){
            int val = Math.min(height[left], height[right]);
            int curr = val * (right - left);
            ans = Math.max(curr, ans);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}