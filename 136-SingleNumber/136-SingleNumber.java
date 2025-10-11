// Last updated: 10/11/2025, 10:40:31 PM
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int i=0; i<nums.length ; i++){
            int count = freq.getOrDefault(nums[i], 0);
            if(count == 1){
                return nums[i];
            }
        }
        return 0;
    }
}