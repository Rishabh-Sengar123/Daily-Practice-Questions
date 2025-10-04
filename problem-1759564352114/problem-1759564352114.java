// Last updated: 10/4/2025, 1:22:32 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        solve(nums, 0, ans, ll);
        return ans;

    }
    public static void solve(int[] nums, int idx, List<List<Integer>> ans, List<Integer> ll){
        ans.add(new ArrayList<>(ll));
        
        for(int i = idx ; i < nums.length; i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            ll.add(nums[i]);
            solve(nums, i+1, ans, ll);
            ll.remove(ll.size()-1);
        }
    }
}