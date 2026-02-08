// Last updated: 2/8/2026, 10:16:36 PM
1/*First part of this question doesnt allows repetion we put i in set and get all the commmon termss one time only*/
2
3/*This question want all the answer exact same with repetions also i want all the common Integers*/
4class Solution {
5    public int[] intersect(int[] nums1, int[] nums2) {
6        HashMap<Integer,Integer> map = new HashMap<>();
7        for(int num : nums1){
8            map.put(num, map.getOrDefault(num, 0)+1);
9        }
10        List<Integer> list = new ArrayList<>();
11        for(int num : nums2){
12            if(map.containsKey(num)  && map.get(num)>0){
13                list.add(num);
14                map.put(num, map.get(num)-1);
15            }
16        }
17        int[] arr = new int[list.size()];
18        for(int i=0; i<list.size(); i++){
19            arr[i] = list.get(i);
20        }
21        return arr;
22    }
23}