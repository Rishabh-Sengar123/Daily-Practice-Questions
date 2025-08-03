// Last updated: 8/3/2025, 9:52:48 AM
class Solution {
    public boolean isValid(String word) {
        if (word == null || word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            if (isVowel(c)) {
                hasVowel = true;
            } else if (Character.isLetter(c)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
