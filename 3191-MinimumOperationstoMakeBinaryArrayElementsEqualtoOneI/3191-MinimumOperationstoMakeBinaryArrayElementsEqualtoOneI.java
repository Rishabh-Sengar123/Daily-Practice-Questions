// Last updated: 1/30/2026, 1:16:49 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int flips = 0;
4        int n = nums.length;
5        
6        for (int i = 0; i <= n - 3; i++) {
7            if (nums[i] == 0) {
8                nums[i] ^= 1;
9                nums[i + 1] ^= 1;
10                nums[i + 2] ^= 1;
11                flips++;
12            }
13        }
14        
15        // Check if all elements are 1
16        for (int num : nums) {
17            if (num == 0) return -1;
18        }
19        
20        return flips;
21    }
22}