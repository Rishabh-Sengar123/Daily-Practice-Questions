// Last updated: 9/5/2025, 2:21:18 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int digi = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        for(int num = 0; num <nums.length; num++){
            digi += rj(nums[num]);
        }
        return Math.abs(sum - digi);
    }
    private int rj(int num){
        int rs = 0;
        while(num>0){
            int digit = num%10;
            rs += digit; 
            num/=10;
        }
        return rs;
    }
}