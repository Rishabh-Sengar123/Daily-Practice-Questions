// Last updated: 8/3/2025, 9:53:04 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int i=0; i< nums.length ; i++){
            if(nums[i]==0){
                continue;
            }else if(nums[i]>=1){
                pos++;
            }else if(nums[i]<=-1){
                neg++;
            }

        }
        return Math.max(pos, neg);
    }
}