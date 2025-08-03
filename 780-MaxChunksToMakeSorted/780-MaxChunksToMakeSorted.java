// Last updated: 8/3/2025, 9:53:59 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
     int chunks = 0;
        int maxSeen = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSeen = Math.max(maxSeen, arr[i]);

            
            if (maxSeen == i) {
                chunks++;
            }
        }

        return chunks;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {4, 3, 2, 1, 0};
        System.out.println("Output: " + solution.maxChunksToSorted(arr1)); 
        
        int[] arr2 = {1, 0, 2, 3, 4};
        System.out.println("Output: " + solution.maxChunksToSorted(arr2));
    }
}