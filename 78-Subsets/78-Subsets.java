// Last updated: 2/4/2026, 12:23:12 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> current = new ArrayList<>();
5      
6        solve(nums, result, current, 0);
7        return result;
8
9    }
10    private void solve(int[] nums, List<List<Integer>> result, List<Integer> current, int idx){
11        result.add(new ArrayList<>(current));
12
13        for(int i = idx; i<nums.length; i++){
14            current.add(nums[i]);
15            solve(nums, result, current, i+1);
16            current.remove(current.size()-1);
17        }
18
19    }
20}