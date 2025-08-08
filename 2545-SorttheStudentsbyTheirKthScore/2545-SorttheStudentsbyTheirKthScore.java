// Last updated: 8/8/2025, 3:33:04 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (p, q) -> Integer.compare(q[k], p[k]));
        return score;
    }
}