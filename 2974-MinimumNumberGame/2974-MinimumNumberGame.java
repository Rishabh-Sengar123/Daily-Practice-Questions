// Last updated: 9/2/2025, 11:05:30 PM
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