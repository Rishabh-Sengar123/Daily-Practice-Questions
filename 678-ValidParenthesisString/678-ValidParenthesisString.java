// Last updated: 1/20/2026, 8:21:42 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int i = 0;
4        int j = 0;
5        for(int k=0; k<s.length(); k++){
6            if(s.charAt(k) == '('){
7                i++;
8                j++;
9            }else if(s.charAt(k) == ')'){
10                i--;
11                j--;
12            }else{
13                i++;
14                j--;
15            }
16            if(i<0){
17                return false;
18            }
19            if(j<0){
20                j = 0;
21            }
22        }
23        return j==0;
24    }
25}