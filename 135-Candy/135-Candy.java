// Last updated: 10/1/2025, 10:48:50 AM
// class Solution {
//     public int candy(int[] ratings) {
//         int n = rating.length;
//         int[] arr = new int[n];
//         arr[0] = 1;
//         for(int i=1; i<n; i++){
//             if(rating[i-1] < rating[i]){
//                 arr[i] = arr[i-1]+1;
//             }else if(rating[i-1]>rating[i]){
//                 arr[i] = 1;
//             }
//         }
//         int[] arr2 = new int[n];
//         arr2[n-1] = 1;
//         for(int i=n-2; i<=1; i--){
//             if(rating[i+1] < rating[i]){
//                 arr[i] = arr[i+1]+1;
//             }else if(rating[i+1]>rating[i]){
//                 arr[i] = 1;
//             }
//         }
//         int sum = 0;
//         for(int num : arr){
//             for(int nums : arr2){
//                 sum += Math.max(num, nums);
//             }
//         }
//         return sum;
        
//     }
// }



class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.max(left[i], right[i]);
        }

        return sum;
    }
}
