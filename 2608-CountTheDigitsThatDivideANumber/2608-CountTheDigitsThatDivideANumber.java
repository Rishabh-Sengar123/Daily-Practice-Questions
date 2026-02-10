// Last updated: 2/10/2026, 3:19:00 PM
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int ric = num;
        while(num>0){
            int digit = num % 10;
            if(ric%digit == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}