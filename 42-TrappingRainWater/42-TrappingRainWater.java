// Last updated: 3/10/2026, 10:49:31 AM
1class Solution {
2    public int trap(int[] height) {
3        return traping(height);
4    }
5    public static int traping(int[] arr){
6        int n = arr.length;
7        int[] left = new int[n];
8        left[0]=arr[0];
9        for(int i=1; i<n; i++){
10            left[i] = Math.max(left[i-1], arr[i]);
11        }
12
13        int[] right = new int[n];
14        right[n-1]=arr[n-1];
15        for(int i=n-2; i>=0; i--){
16            right[i] = Math.max(right[i+1], arr[i]);
17        }
18        int sum = 0;
19        for(int i=0; i<n; i++){
20            sum += Math.min(left[i], right[i])-arr[i];
21        }
22        return sum;
23    }
24}