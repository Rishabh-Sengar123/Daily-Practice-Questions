// Last updated: 2/10/2026, 3:23:08 PM
class Solution {
    public int lastRemaining(int n) {
    return solve(n);
}

private int solve(int n) {
    if (n == 1) return 1;
    return 2 * ((n / 2) + 1 - solve(n / 2));
}

}