// Last updated: 2/10/2026, 3:18:04 PM
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