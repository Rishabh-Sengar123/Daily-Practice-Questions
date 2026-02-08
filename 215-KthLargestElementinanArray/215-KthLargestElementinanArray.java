// Last updated: 2/8/2026, 2:34:54 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for(int i=0; i<k; i++){
5            pq.add(nums[i]);
6        }
7
8        for(int i=k ; i<nums.length; i++){
9            if(nums[i]>pq.peek()){
10                pq.poll();
11                pq.add(nums[i]);
12            }
13        }
14        return pq.poll();
15    }
16}