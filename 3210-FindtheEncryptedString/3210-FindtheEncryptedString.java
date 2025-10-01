// Last updated: 10/1/2025, 3:05:13 PM
public class Solution {
    public static String getEncryptedString(String s, int k) {
        int n = s.length();
        if (n == 0) return s;
        k %= n;
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            res[i] = s.charAt((i + k) % n);
        }
        return new String(res);
    }
}