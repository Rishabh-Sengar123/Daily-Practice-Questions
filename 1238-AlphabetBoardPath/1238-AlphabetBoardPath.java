// Last updated: 2/10/2026, 3:21:16 PM
class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder ans = new StringBuilder();

        int currRow = 0, currCol = 0;

        for (char ch : target.toCharArray()) {
            int targetRow = (ch - 'a') / 5;
            int targetCol = (ch - 'a') % 5;

            while (currRow > targetRow) {
                ans.append('U');
                currRow--;
            }
            while (currCol > targetCol) {
                ans.append('L');
                currCol--;
            }
            while (currRow < targetRow) {
                ans.append('D');
                currRow++;
            }
            while (currCol < targetCol) {
                ans.append('R');
                currCol++;
            }

            ans.append('!');
        }

        return ans.toString();
    }
}
