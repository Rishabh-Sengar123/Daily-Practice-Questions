// Last updated: 2/3/2026, 11:58:14 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> current = new ArrayList<>();
5        solve(candidates, target, 0, 0, result, current);
6        return result;
7    }
8    private void solve(int[] candidates, int target, int idx, int sum, List<List<Integer>> result, List<Integer> current){
9        if(sum == target){
10            result.add(new ArrayList<>(current));
11            return;
12        }
13        if(idx == candidates.length || sum > target){
14            return ;
15        }
16        
17        current.add(candidates[idx]);
18        solve(candidates, target, idx, sum+candidates[idx], result, current);
19        
20        current.remove(current.size()-1);
21
22        solve(candidates, target, idx+1, sum, result, current);
23        
24    }
25
26}