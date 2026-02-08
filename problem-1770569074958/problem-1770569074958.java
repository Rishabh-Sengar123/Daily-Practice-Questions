// Last updated: 2/8/2026, 10:14:34 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num : nums1){
5            map.put(num, map.getOrDefault(num, 0)+1);
6        }
7        List<Integer> list = new ArrayList<>();
8        for(int num : nums2){
9            if(map.containsKey(num)  && map.get(num)>0){
10                list.add(num);
11                map.put(num, map.get(num)-1);
12            }
13        }
14        int[] arr = new int[list.size()];
15        for(int i=0; i<list.size(); i++){
16            arr[i] = list.get(i);
17        }
18        return arr;
19    }
20}