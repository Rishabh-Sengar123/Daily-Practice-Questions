// Last updated: 8/3/2025, 9:52:59 AM
class Solution {
    public int sumOfMultiples(int n) {
        int add = 0;
        for(int i= 0; i<= n; i++){
            if(i%3==0 | i%5==0 | i%7==0){
                add+=i;
            }
        }
        return add;
    }
}