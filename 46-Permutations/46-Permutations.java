// Last updated: 10/5/2025, 8:53:55 AM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        solve(nums, 0, ll, ans, visited);
        return ans;
    }
    public static void solve(int[] nums, int idx , List<Integer> ll, List<List<Integer>> ans, boolean[] visited){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            if(visited[i] == false){
                ll.add(nums[i]);
                visited[i] = true;
                solve(nums, idx+1, ll, ans, visited);
                visited[i] = false;
                ll.remove(ll.size()-1);

            }
        }

    }
}