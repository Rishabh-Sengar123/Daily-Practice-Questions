// Last updated: 10/5/2025, 3:38:17 PM
import java.util.Arrays;

class Solution {
    public int[] fullBloomFlowers(int[][] flower, int[] people) {
        int n = flower.length;
        int[] start = new int[n];
        int[] end = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = flower[i][0];
            end[i] = flower[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int[] ans = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            
            int started = upperBound(start, people[i]);
          
            int ended = lowerBound(end, people[i]);
            ans[i] = started - ended;
        }
        return ans;
    }
    
   
    public int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    public int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
