// Last updated: 2/10/2026, 3:20:26 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (char c : word1.toCharArray()) f1[c - 'a']++;
        for (char c : word2.toCharArray()) f2[c - 'a']++;

        // Condition 1: same character set
        for (int i = 0; i < 26; i++) {
            if ((f1[i] == 0 && f2[i] != 0) || (f1[i] != 0 && f2[i] == 0))
                return false;
        }

        // Condition 2: same frequency pattern
        Arrays.sort(f1);
        Arrays.sort(f2);

        return Arrays.equals(f1, f2);
    }
}
