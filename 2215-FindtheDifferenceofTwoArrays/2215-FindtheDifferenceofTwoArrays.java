// Last updated: 2/8/2026, 10:31:02 PM
1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> list = new ArrayList<>();
5        List<Integer> list2 = new ArrayList<>();
6
7        HashMap<Integer, Integer> map = new HashMap<>();
8        for(int num : nums2){
9            map.put(num, map.getOrDefault(num, 0)+1);
10        }
11        for(int num : nums1){
12            if(!map.containsKey(num) && !list.contains(num)){
13                list.add(num);
14            }
15        }
16        HashMap<Integer, Integer> map2 = new HashMap<>();
17        for(int num : nums1){
18            map2.put(num, map2.getOrDefault(num, 0)+1);
19        }
20        for(int num : nums2){
21            if(!map2.containsKey(num) && !list2.contains(num)){
22                list2.add(num);
23            }
24        }
25        result.add(list);
26        result.add(list2);
27
28        return result;
29    }
30}