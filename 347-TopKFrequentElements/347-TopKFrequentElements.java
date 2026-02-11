// Last updated: 2/11/2026, 2:35:51 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int num : nums){
5            map.put(num, map.getOrDefault(num, 0)+1);
6        }
7        PriorityQueue<Map.Entry<Integer, Integer>> pq =
8        new PriorityQueue<>(
9                (a, b) -> Integer.compare(b.getValue(), a.getValue())
10        );
11        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
12            pq.offer(entry);
13        }
14
15        List<Integer> list = new ArrayList<>();
16        for(int i=0; i<k; i++){
17            list.add(pq.poll().getKey());
18        }
19        Collections.reverse(list);
20        int size = list.size();
21        int[] arr = new int[size];
22        for(int i=0; i<size; i++){
23            arr[i] = list.get(i);
24        }
25        return arr;
26    }
27}