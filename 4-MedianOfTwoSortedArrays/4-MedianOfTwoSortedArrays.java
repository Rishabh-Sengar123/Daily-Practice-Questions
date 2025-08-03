// Last updated: 8/3/2025, 10:44:03 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int leng1 = nums1.length + nums2.length;
        float[] nums3 = new float[leng1];

        int position = 0;
        for(int element : nums1){
            nums3[position] = element;
            position++;}
        for(int element : nums2){
            nums3[position] = element;
            position++;
        }
        Arrays.sort(nums3);
        if(leng1%2!=0)
        {
            return nums3[leng1/2];
        }
        return (nums3[leng1/2 -1] + nums3[(leng1)/2])  /2 ;
    }
}