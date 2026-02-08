// Last updated: 2/8/2026, 10:37:29 PM
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int num : nums){
5            map.put(num, map.getOrDefault(num, 0)+1);
6        }
7        int max = Integer.MIN_VALUE;
8        for(int value : map.values()){
9            if(value > max){
10                max = value;
11            }
12        }
13        int count = 0;
14        for(int value : map.values()){
15            if(value == max){
16                count += value;
17            }
18        }
19
20    return count;
21    }
22}