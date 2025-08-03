// Last updated: 8/3/2025, 9:54:46 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int val = nums[i];
            if(seen.containsKey(val)&&i-seen.get(val)<=k){
                return true;
            }
            seen.put(val, i);
        } 
        return false;
    }
}