// Last updated: 3/8/2026, 6:42:46 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> answer = new ArrayList<>();
4        for(int i=0; i<nums.length; i++){
5            int index = Math.abs(nums[i])-1;
6            if(nums[index]>0){
7                nums[index] = -nums[index];
8            }
9        }
10        for(int i=0; i<nums.length; i++){
11            if(nums[i]>0){
12                answer.add(i+1);
13            }
14        }
15        return answer;
16    }
17}