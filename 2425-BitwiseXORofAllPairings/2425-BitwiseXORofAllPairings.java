// Last updated: 1/21/2026, 12:06:25 PM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int x1= 0;
4        int x2 = 0;
5        for(int i : nums1){
6            x1 ^= i;
7        }
8        for(int i : nums2){
9            x2 ^= i;
10        }
11        int xor = 0;
12        if(nums2.length%2 == 1){
13            xor ^= x1;
14        }
15        if(nums1.length%2 == 1){
16            xor ^= x2;
17        }
18        return xor;
19    }
20}