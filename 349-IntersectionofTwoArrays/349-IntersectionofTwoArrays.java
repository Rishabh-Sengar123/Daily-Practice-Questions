// Last updated: 2/8/2026, 10:03:56 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set = new HashSet<>();
4        HashSet<Integer> set2 = new HashSet<>();
5        for(int num : nums1){
6            set.add(num);
7        }
8        for(int num : nums2){
9            set2.add(num);
10        }
11        HashMap<Integer, Integer> freq = new HashMap<>();
12
13        for(int num : set){
14            freq.put(num, freq.getOrDefault(num, 0) + 1);
15        }
16
17        for(int num : set2){
18            freq.put(num, freq.getOrDefault(num, 0) + 1);
19        }
20        // int count = 0;
21        // for (Integer value : freq.values()) {
22        //     if(value>1){
23        //         count++;
24        //     }
25        // }
26        // int[] arr = new int[count];
27        List<Integer> list = new ArrayList<>();
28        // int i = 0;
29        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
30            if (entry.getValue() > 1) {
31                list.add(entry.getKey());
32            }
33        }
34        int[] arr = new int[list.size()];
35        for(int i=0; i<list.size(); i++){
36            arr[i] = list.get(i);
37        }
38        return arr;
39    }
40}