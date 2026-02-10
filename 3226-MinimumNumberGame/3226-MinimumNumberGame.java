// Last updated: 2/10/2026, 3:18:19 PM
class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.sort(nums);
        int idx = 0;
        for(int i=0; i<n-1; i+=2){
            arr[idx++] = nums[i+1];
            arr[idx++] = nums[i];

        }
        return arr;
    }
}