// Last updated: 8/3/2025, 10:43:36 AM
class Solution {
    public static void nextPermutation(int[] nums) {
        int p = -1;
        int n = nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if (nums[i] < nums[i+1]) {
                p = i;
                break;
            }
        }

        if (p==-1){
            Reverse(nums,0,n-1);
            return;
        }
        int q = -1;
        for (int i = n -1; i>p;i--){
            if (nums[i] > nums[p]) {
                q = i;
                break;
            }
        }
        //swap p and q
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
        
        //reverse the remaining part
        Reverse(nums, p+1, n-1);
        
    }
    public static void Reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
