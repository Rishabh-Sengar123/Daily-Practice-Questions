// Last updated: 2/10/2026, 3:20:18 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int sum  = 0;
        for(int i=0; i<nums.length; i++){
            int count = freq.getOrDefault(nums[i], 0);
                if(count == 1){
                sum += nums[i];
            }   
        }
        return sum;
    
    }
}