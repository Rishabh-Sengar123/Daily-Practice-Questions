// Last updated: 2/10/2026, 3:19:50 PM
class Solution {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        int n = s.length();

        // count how many 'letter' exist ahead
        int futureLetter = 0;
        for (char c : s.toCharArray())
            if (c == letter) futureLetter++;

        StringBuilder st = new StringBuilder();
        int usedLetter = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // try to remove bigger chars for lexicographically smaller result
            while (st.length() > 0 &&
                   st.charAt(st.length()-1) > c &&
                   st.length() - 1 + (n - i) >= k &&   // enough chars left
                   (st.charAt(st.length()-1) != letter || 
                    usedLetter - 1 + futureLetter >= repetition)) {
                
                if (st.charAt(st.length()-1) == letter) usedLetter--;
                st.deleteCharAt(st.length()-1);
            }

            // try to add current char
            if (st.length() < k) {
                if (c == letter) {
                    st.append(c);
                    usedLetter++;
                } else if (k - st.length() > repetition - usedLetter) {
                    // only add non-letter if space left after required letters
                    st.append(c);
                }
            }

            if (c == letter) futureLetter--;
        }

        return st.toString();
    }
}
