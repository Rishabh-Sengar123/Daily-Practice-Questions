// Last updated: 2/10/2026, 3:18:51 PM
import java.util.*;

class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int cnt = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                cnt++;
                j = (j + k) % n;
            }

            int[] cycle = new int[cnt];
            j = i;
            int idx = 0;

            while (idx < cnt) {
                cycle[idx++] = arr[j];
                j = (j + k) % n;
            }

            Arrays.sort(cycle);
            int median = cycle[cnt / 2];

            for (int val : cycle) {
                ans += Math.abs(val - median);
            }
        }

        return ans;
    }
}

