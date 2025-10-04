// Last updated: 10/4/2025, 2:59:50 PM
class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int k = right-left;
            
            max = Math.min(height[left], height[right]) * k;

            ans = Math.max(max, ans);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
            
        }
        return ans;
    }
}