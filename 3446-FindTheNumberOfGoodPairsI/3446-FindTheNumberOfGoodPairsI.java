// Last updated: 8/3/2025, 9:52:44 AM
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i =0; i < nums1.length; i++){
            for(int j =0; j < nums2.length ; j++){
                int l = nums2[j] * k;
                if(nums1[i]%l == 0){
                    count++;
                }
            }

        }
        return count;
    }
}