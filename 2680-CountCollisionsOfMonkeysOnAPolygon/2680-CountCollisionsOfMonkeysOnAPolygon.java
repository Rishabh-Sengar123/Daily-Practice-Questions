// Last updated: 2/10/2026, 3:18:48 PM
class Solution {
    static final long MOD = 1000000007L;
    
    public int monkeyMove(int n) {
        long total = modPow(2, n);
        long ans = (total - 2 + MOD) % MOD;
        return (int) ans;
    }
    
    private long modPow(long base, long exp) {
        long res = 1;
        base %= MOD;
        
        while (exp > 0) {
            if ((exp & 1) == 1) 
                res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
}
