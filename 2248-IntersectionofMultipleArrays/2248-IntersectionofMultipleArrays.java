// Last updated: 2/8/2026, 11:04:26 PM
1class Solution {
2    public List<Integer> intersection(int[][] nums) {
3        List<Integer> list = new ArrayList<>();
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for(int i=0; i<nums.length; i++){
6            for(int j=0; j<nums[i].length; j++){
7                int num = nums[i][j];
8                map.put(num, map.getOrDefault(num, 0)+1);
9            }
10        }
11        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
12            if(entry.getValue() == nums.length){
13                list.add(entry.getKey());
14            }
15        }
16        Collections.sort(list);
17        return list;
18    }
19}