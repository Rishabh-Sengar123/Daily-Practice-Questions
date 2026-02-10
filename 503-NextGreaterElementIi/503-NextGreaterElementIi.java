// Last updated: 2/10/2026, 3:22:44 PM
import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        Deque<Integer> stack = new ArrayDeque<>(); 
     
        
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;
            
            while (!stack.isEmpty() && nums[stack.peekLast()] < nums[idx]) {
                ans[stack.removeLast()] = nums[idx];
            }
            
            if (i < n) {
                stack.addLast(idx);
            }
        }
        
        return ans;
    }
}
