// Last updated: 8/3/2025, 9:54:39 AM
class Solution {
    public int missingNumber(int[] nums) {
        int leng = nums.length;
        int num = 0;
        Arrays.sort(nums);
        int ms = nums[leng - 1];
        for(int i = 0 ; i < leng ; i++){
            num += nums[i];
        }
        int count = 0;
        for(int i = 0; i <= leng ; i++){
            count += i;
        }
        return count - num;
        
    }
}