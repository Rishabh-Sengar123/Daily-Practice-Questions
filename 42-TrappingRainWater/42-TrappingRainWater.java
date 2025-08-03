// Last updated: 8/3/2025, 10:43:25 AM
class Solution {
    public int trap(int[] height) {
        return traping(height);
    }
    public static int traping(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i = 1 ; i< arr.length; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i >=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int sum = 0;
        for(int i= 0; i<right.length; i++){
            sum =sum +  Math.min(left[i] , right[i]) - arr[i];
        }
        return sum;
    }
    
}