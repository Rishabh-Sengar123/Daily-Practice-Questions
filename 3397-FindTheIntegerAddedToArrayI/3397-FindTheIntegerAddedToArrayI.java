// Last updated: 8/3/2025, 9:52:50 AM
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int love =  0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0; i < nums1.length ; i++){
            for(int j =0; j < nums2.length ; j++){
                love = nums2[j] - nums1[i];
            }
        }
        return love;
    }
}