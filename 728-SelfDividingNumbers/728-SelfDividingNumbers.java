// Last updated: 9/5/2025, 2:10:04 PM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int num = left ; num <= right; num++){
            if(isDivide(num)){
                result.add(num);
            }
        }
        return result;
    }
    private boolean isDivide(int num ){
        int temp = num;
        while(temp>0){
            int digit = temp%10;
            if(digit == 0 || num % digit != 0 ){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}