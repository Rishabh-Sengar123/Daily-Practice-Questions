// Last updated: 2/10/2026, 3:22:33 PM
import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1 = new String(arr1);

        for (int i = 0; i <= m - n; i++) {
            String sub = s2.substring(i, i + n); 
            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            String sortedSub = new String(arr2);

            if (sortedS1.equals(sortedSub)) {
                return true; 
            }
        }

        return false;
    }
}
