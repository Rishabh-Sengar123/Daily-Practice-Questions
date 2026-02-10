// Last updated: 2/10/2026, 12:37:20 PM
1import java.math.BigInteger;
2
3class Solution {
4    public String multiply(String num1, String num2) {
5
6        BigInteger n = new BigInteger(num1);
7        BigInteger m = new BigInteger(num2);
8
9        BigInteger ans = n.multiply(m);
10
11        return ans.toString();
12    }
13}
14