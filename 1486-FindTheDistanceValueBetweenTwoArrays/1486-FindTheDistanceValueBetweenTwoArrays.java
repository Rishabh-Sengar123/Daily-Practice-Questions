// Last updated: 8/11/2025, 11:54:26 PM
import java.util.*;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int num : arr1) {
            // Find the index where num could be inserted
            int idx = Arrays.binarySearch(arr2, num);
            
            if (idx < 0) idx = -(idx + 1); // insertion point
            
            boolean isValid = true;

            // Check the closest element on the left
            if (idx - 1 >= 0 && Math.abs(num - arr2[idx - 1]) <= d) {
                isValid = false;
            }
            // Check the closest element on the right
            if (idx < arr2.length && Math.abs(num - arr2[idx]) <= d) {
                isValid = false;
            }

            if (isValid) count++;
        }

        return count;
    }
}
