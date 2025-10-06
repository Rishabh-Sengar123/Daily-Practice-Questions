// Last updated: 10/6/2025, 1:24:33 PM
import java.util.*;

class Solution {
    private int count = 0;

    public int countArrangement(int n) {
        // Precompute valid candidates for each position i (1-indexed)
        @SuppressWarnings("unchecked")
        List<Integer>[] candidates = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            candidates[i] = new ArrayList<>();
            for (int num = 1; num <= n; num++) {
                if (num % i == 0 || i % num == 0) {
                    candidates[i].add(num);
                }
            }
        }

        boolean[] used = new boolean[n + 1];
        backtrack(n, 1, used, candidates);
        return count;
    }

    private void backtrack(int n, int pos, boolean[] used, List<Integer>[] candidates) {
        if (pos > n) {
            count++;
            return;
        }

        for (int num : candidates[pos]) {
            if (!used[num]) {
                used[num] = true;
                backtrack(n, pos + 1, used, candidates);
                used[num] = false;
            }
        }
    }
}
