// Last updated: 10/11/2025, 10:17:19 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() != 2) {
                continue;
            }else{
                ans ^= entry.getKey();
            }
        }
        return ans;
    }
}