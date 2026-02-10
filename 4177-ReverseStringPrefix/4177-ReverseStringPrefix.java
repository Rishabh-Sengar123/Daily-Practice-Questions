// Last updated: 2/10/2026, 3:17:20 PM
class Solution {
    public String reversePrefix(String s, int k) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = k-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}