// Last updated: 1/7/2026, 4:32:08 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() != goal.length()){
4            return false;
5        }
6        return (goal+goal).contains(s);
7    }
8}