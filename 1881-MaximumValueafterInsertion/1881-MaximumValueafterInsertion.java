// Last updated: 2/11/2026, 12:03:13 PM
1class Solution {
2    public String maxValue(String n, int x) {
3        char ch = (char) (x + '0');
4
5        if (n.charAt(0) == '-') {
6            for (int i = 1; i < n.length(); i++) {
7                if (n.charAt(i) - '0' > x) {
8                    return n.substring(0, i) + ch + n.substring(i);
9                }
10            }
11            return n + ch;   
12        }
13
14        else {
15            for (int i = 0; i < n.length(); i++) {
16                if (n.charAt(i) - '0' < x) {
17                    return n.substring(0, i) + ch + n.substring(i);
18                }
19            }
20            return n + ch;   // if not inserted inside
21        }
22    }
23}
24