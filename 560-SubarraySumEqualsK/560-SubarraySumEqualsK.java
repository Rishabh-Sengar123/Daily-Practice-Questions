// Last updated: 9/12/2025, 1:41:09 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            ans += i;
            res +=  map.getOrDefault(ans-k , 0);
            map.put(ans, map.getOrDefault(ans,0)+1);
        }
        return res;

    }
}