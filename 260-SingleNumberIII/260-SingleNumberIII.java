// Last updated: 1/14/2026, 12:34:02 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int[] arr = new int[2];
4        Map<Integer, Integer> freq = new HashMap<>();
5        for(int num : nums){
6            freq.put(num, freq.getOrDefault(num, 0)+1);
7        }
8        int idx = 0;
9        for(int i=0; i<nums.length ; i++){
10            int count = freq.getOrDefault(nums[i], 0);
11            if(count == 1){
12                arr[idx] = nums[i];
13                idx++;
14                
15            }
16        }
17        return arr;
18    }
19}