// Last updated: 1/5/2026, 11:33:54 AM
1class Solution {
2    public int minimumBuckets(String s) {
3    if (s.equals("H") || s.startsWith("HH") || s.endsWith("HH") || s.contains("HHH"))
4        return -1;
5    else
6        return s.split("H", -1).length - s.split("H\\.H", -1).length;
7    }
8}
9