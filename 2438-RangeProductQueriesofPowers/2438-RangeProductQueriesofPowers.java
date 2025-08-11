// Last updated: 8/11/2025, 9:43:34 AM
class Solution {
    static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        
        List<Integer> powers = new ArrayList<>();
        for (int bit = 0; (1 << bit) <= n; bit++) {
            if ((n & (1 << bit)) != 0) powers.add(1 << bit);
        }

       
        long[] pref = new long[powers.size() + 1];
        pref[0] = 1;
        for (int i = 0; i < powers.size(); i++) {
            pref[i + 1] = (pref[i] * powers.get(i)) % MOD;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            ans[i] = (int)((pref[r + 1] * modPow(pref[l], MOD - 2)) % MOD);
        }
        return ans;
    }

    private long modPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}
