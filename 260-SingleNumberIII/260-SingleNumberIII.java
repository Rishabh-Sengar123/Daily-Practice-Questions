// Last updated: 10/11/2025, 10:31:43 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int idx = 0;
        for(int i=0; i<nums.length ; i++){
            int count = freq.getOrDefault(nums[i], 0);
            if(count == 1){
                arr[idx] = nums[i];
                idx++;
                
            }
        }
        return arr;
    }
}