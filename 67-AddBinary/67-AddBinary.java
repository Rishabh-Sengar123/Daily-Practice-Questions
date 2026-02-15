// Last updated: 2/15/2026, 11:59:57 AM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder result = new StringBuilder();
4        int i = a.length() - 1, j = b.length() - 1, carry = 0;
5        while (i >= 0 || j >= 0 || carry == 1) {
6            int total = carry;
7            if (i >= 0) total += a.charAt(i--) - '0';
8            if (j >= 0) total += b.charAt(j--) - '0';
9            result.append(total % 2);
10            carry = total / 2;
11        }
12        return result.reverse().toString();
13    }
14}