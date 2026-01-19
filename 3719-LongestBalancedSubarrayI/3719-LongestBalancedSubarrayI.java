// Last updated: 1/19/2026, 10:41:44 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int maxLen = 0;
4        for(int i=0; i<nums.length; i++){
5            HashSet<Integer> even = new HashSet<>();
6            HashSet<Integer> odd = new HashSet<>();
7            int evenCount = 0;
8            int oddCount = 0;
9            for(int j=i; j<nums.length; j++){
10                int moment = nums[j];
11                
12                if(!even.contains(moment) && moment%2 == 0){
13                    even.add(moment);
14                    evenCount++;
15                }else if(!odd.contains(moment) && moment%2 != 0){
16                    odd.add(moment);
17                    oddCount++;
18                }
19                if(evenCount == oddCount){
20                    maxLen = Math.max(maxLen, j-i+1);
21                }
22            }
23        }
24        return maxLen;
25    
26
27    }
28}