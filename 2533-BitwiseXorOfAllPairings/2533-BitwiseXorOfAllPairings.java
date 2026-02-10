// Last updated: 2/10/2026, 3:19:07 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x1= 0;
        int x2 = 0;
        for(int i : nums1){
            x1 ^= i;
        }
        for(int i : nums2){
            x2 ^= i;
        }
        int xor = 0;
        if(nums2.length%2 == 1){
            xor ^= x1;
        }
        if(nums1.length%2 == 1){
            xor ^= x2;
        }
        return xor;
    }
}