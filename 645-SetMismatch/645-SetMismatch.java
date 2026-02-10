// Last updated: 2/10/2026, 3:22:26 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int i=0; i<=nums.length; i++){
            int ans = freq.getOrDefault(i, 0);
            if(ans == 0){
                arr[1] = i;
            }else if(ans == 2){
                arr[0] = i;
            }
        }
        return arr;
    }
}