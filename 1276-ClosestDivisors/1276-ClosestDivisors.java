// Last updated: 8/3/2025, 9:53:47 AM
class Solution {
    public int[] closestDivisors(int num) {
        // Check num + 1 and num + 2
        int[] res1 = getClosestDivisors(num + 1);
        int[] res2 = getClosestDivisors(num + 2);
        
 
        if (Math.abs(res1[0] - res1[1]) <= Math.abs(res2[0] - res2[1])) {
            return res1;
        } else {
            return res2;
        }
    }

    private int[] getClosestDivisors(int n) {
        for (int i = (int)Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                return new int[]{i, n / i};
            }
        }
        return new int[]{1, n}; 
    }
}
