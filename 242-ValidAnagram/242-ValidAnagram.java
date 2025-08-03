// Last updated: 8/3/2025, 9:54:41 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        if(ch.length!=ch2.length)
        {
            return false;
        }
        Arrays.sort(ch);
        Arrays.sort(ch2);
        String str = new String(ch);
        String str2 = new String(ch2);
        boolean isequals = str.equals(str2);
        return isequals;
    }
}