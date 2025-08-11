// Last updated: 8/11/2025, 11:53:58 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (p, q) -> Integer.compare(q[k], p[k]));
        return score;
    }
}