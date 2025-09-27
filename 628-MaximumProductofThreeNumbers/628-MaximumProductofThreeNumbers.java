// Last updated: 9/27/2025, 1:37:49 PM
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while(l<=r){
            mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}