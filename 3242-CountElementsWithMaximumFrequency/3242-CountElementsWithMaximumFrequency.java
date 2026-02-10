// Last updated: 2/10/2026, 3:18:17 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int value : map.values()){
            if(value > max){
                max = value;
            }
        }
        int count = 0;
        for(int value : map.values()){
            if(value == max){
                count += value;
            }
        }

    return count;
    }
}