// Last updated: 1/23/2026, 12:51:37 PM
1class Solution {
2    public String makeGood(String s) {
3        StringBuilder stack = new StringBuilder();
4        for(char ch : s.toCharArray()){
5            int n = stack.length();
6            if(n>0 && Math.abs(stack.charAt(n-1) - ch) == 32){
7                stack.deleteCharAt(n-1);
8            }else{
9                stack.append(ch);
10            }
11        }
12        return stack.toString();
13    }
14}
15