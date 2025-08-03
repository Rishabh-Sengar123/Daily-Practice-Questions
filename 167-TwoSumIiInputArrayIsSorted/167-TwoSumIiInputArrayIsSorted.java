// Last updated: 8/3/2025, 9:54:59 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum= -1,left=0,right=numbers.length-1;
        while(sum!=target){
            sum=numbers[left]+numbers[right];
            if(sum<target)
            left++;
            else if(sum>target)
            right--;
        }
        return new int[]{left+1,right+1};
       
    }
}
    