// Last updated: 1/7/2026, 4:31:46 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() != goal.length()){
4            return false;
5        }
6        return (s+s).contains(goal);
7    }
8}