// Last updated: 2/10/2026, 3:21:34 PM
class Solution {
    public int minDeletionSize(String[] strs) {

        int rows = strs.length;
        int cols = strs[0].length();

        boolean[] sorted = new boolean[rows - 1];
        int deleteCount = 0;

        for (int c = 0; c < cols; c++) {

            boolean deleteColumn = false;

            for (int r = 0; r < rows - 1; r++) {
                if (!sorted[r] && strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    deleteColumn = true;
                    break;
                }
            }

            if (deleteColumn) {
                deleteCount++;
                continue;
            }

            for (int r = 0; r < rows - 1; r++) {
                if (!sorted[r] && strs[r].charAt(c) < strs[r + 1].charAt(c)) {
                    sorted[r] = true;
                }
            }
        }

        return deleteCount;
    }
}
