// Last updated: 2/10/2026, 3:19:49 PM
class Solution {
    public int minimumBuckets(String s) {
    if (s.equals("H") || s.startsWith("HH") || s.endsWith("HH") || s.contains("HHH"))
        return -1;
    else
        return s.split("H", -1).length - s.split("H\\.H", -1).length;
    }
}
