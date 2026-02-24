// Last updated: 2/25/2026, 12:14:08 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4        List<List<Integer>> result = new ArrayList<>();
5        backtrack(candidates, target, 0, new ArrayList<>(), result);
6        return result;
7    }
8
9    private void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
10        if (target == 0) {
11            result.add(new ArrayList<>(path));
12            return;
13        }
14
15        for (int i = start; i < candidates.length; i++) {
16            if (i > start && candidates[i] == candidates[i - 1]) continue; 
17            if (candidates[i] > target) break;
18
19            path.add(candidates[i]);
20            backtrack(candidates, target - candidates[i], i + 1, path, result);
21            path.remove(path.size() - 1);
22        }
23    }
24}
25