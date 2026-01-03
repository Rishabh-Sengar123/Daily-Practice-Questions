// Last updated: 1/3/2026, 8:19:33 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        char[] ch = s.toCharArray();
4        int i = 0;
5        int j = k-1;
6        while(i<j){
7            char temp = ch[i];
8            ch[i] = ch[j];
9            ch[j] = temp;
10            i++;
11            j--;
12        }
13        return String.valueOf(ch);
14    }
15}