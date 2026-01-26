// Last updated: 1/26/2026, 12:08:09 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(arr);
5        int minDiff = Integer.MAX_VALUE;
6        for(int i=1; i<arr.length; i++){
7            int diff = arr[i]-arr[i-1];
8            minDiff = Math.min(minDiff, diff);
9        }
10        for(int i=1; i<arr.length; i++){
11            List<Integer> list = new ArrayList<>();
12            if(arr[i]-arr[i-1] == minDiff){
13                list.add(arr[i-1]);
14                list.add(arr[i]);
15                result.add(list);
16            }
17        }
18        return result;
19    }
20}