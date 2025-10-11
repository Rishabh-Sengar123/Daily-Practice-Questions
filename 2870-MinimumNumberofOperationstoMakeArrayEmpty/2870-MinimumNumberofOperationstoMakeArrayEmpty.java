// Last updated: 10/11/2025, 9:54:06 PM
class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num , 0) + 1);
        }
        int count = 0;
        for(int num : freq.keySet()){
            int f = freq.get(num);
            if(f == 1){
                return -1;
            }

            count += (f + 2)/3;
        }

        return count;

    }
}