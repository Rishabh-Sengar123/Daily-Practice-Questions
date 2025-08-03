// Last updated: 8/3/2025, 9:54:06 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        long lower = 0;
        long higher = (int)Math.sqrt(c);
        while(lower<=higher){
            long sum = lower*lower + higher*higher;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                lower++;
            }else{
                higher--;
            }
        }
        return false;

    }
}