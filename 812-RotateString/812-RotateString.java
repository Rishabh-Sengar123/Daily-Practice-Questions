// Last updated: 2/10/2026, 3:22:01 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return (goal+goal).contains(s);
    }
}