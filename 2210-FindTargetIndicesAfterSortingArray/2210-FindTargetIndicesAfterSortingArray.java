// Last updated: 8/3/2025, 9:53:26 AM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(nums[i] == target ){
                list.add(i);
            }
        }
        return list;
    }

}