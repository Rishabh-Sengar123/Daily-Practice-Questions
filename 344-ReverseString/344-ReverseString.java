// Last updated: 8/7/2025, 10:28:21 AM
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j = s.length-1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for(char ch : s){
            System.out.print(ch);
        }
    }
}