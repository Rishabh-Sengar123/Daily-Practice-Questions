// Last updated: 2/10/2026, 3:18:10 PM
import java.util.*;

class Solution {
    public long numberOfSubarrays(int[] nums) {
        Deque<long[]> stack = new ArrayDeque<>();
        long ans = 0;

        for (int x : nums) {
  
            while (!stack.isEmpty() && stack.peek()[0] < x) {
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek()[0] == x) {
                stack.peek()[1]++;
            } else {
                stack.push(new long[]{x, 1});
            }

            ans += stack.peek()[1];
        }

        return ans;
    }
}
