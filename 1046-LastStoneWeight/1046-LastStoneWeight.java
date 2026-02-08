// Last updated: 2/8/2026, 2:47:32 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int i=0; i<stones.length; i++){
5            pq.add(stones[i]);
6        }
7        while(pq.size()>1){
8            int x = pq.poll();
9            int y = pq.poll();
10
11            if(x!=y){
12                pq.add(x-y);
13            }
14        }
15        if(pq.isEmpty()){
16            return 0;
17        }
18
19        return pq.peek();
20    }
21}