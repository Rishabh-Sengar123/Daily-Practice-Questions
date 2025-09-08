// Last updated: 9/8/2025, 7:43:46 PM
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