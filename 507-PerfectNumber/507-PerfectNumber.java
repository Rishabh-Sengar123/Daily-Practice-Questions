// Last updated: 8/3/2025, 9:54:14 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <=1){
            return false;
        }
        int sum  = 0;
        int half = num/2;
        for(int i = 1; i< half+1; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum == num;
    }
}