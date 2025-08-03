// Last updated: 8/3/2025, 2:47:46 PM
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        long sum = 0;
        while(l<=r){
            if(l==r){
                sum+= nums[l];
            }else{
                String a = nums[l]+""+nums[r];
                sum+= Integer.parseInt(a);
                
            }
            l++;
            r--;
        }
        return sum;
    }
}