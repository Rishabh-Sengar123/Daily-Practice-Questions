// Last updated: 8/3/2025, 9:54:56 AM
class Solution {
    public void rotate(int[] nums, int k) {
        RotateArray(nums, k);
    }
    public static void RotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n ;
        Reverse(arr, 0 , n-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k , n-1);
    }
    public static void Reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}