// Last updated: 1/22/2026, 8:19:27 PM
1import java.util.*;
2
3class Solution {
4    public int[] nextGreaterElements(int[] nums) {
5        int n = nums.length;
6        int[] ans = new int[n];
7        Arrays.fill(ans, -1);
8        
9        Deque<Integer> stack = new ArrayDeque<>(); 
10     
11        
12        for (int i = 0; i < 2 * n; i++) {
13            int idx = i % n;
14            
15            while (!stack.isEmpty() && nums[stack.peekLast()] < nums[idx]) {
16                ans[stack.removeLast()] = nums[idx];
17            }
18            
19            if (i < n) {
20                stack.addLast(idx);
21            }
22        }
23        
24        return ans;
25    }
26}
27