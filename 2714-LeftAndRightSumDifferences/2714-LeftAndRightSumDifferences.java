// Last updated: 8/3/2025, 9:53:00 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        leftsum[0]=0;
        for(int i=1; i< nums.length;i++){
            leftsum[i]=nums[i-1]+leftsum[i-1];
        }
        rightsum[nums.length-1]=0;
        for(int j=nums.length-2; j>=0;j--){
            rightsum[j]=nums[j+1]+rightsum[j+1];
        }
        for(int k=0;k<nums.length;k++)
     
        {
        nums[k]=Math.abs(leftsum[k]-rightsum[k]);
     }  
     return nums;
    }
}