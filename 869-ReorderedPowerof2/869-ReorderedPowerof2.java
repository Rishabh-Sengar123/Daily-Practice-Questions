// Last updated: 8/10/2025, 11:26:30 AM
import java.util.*;

public class Solution {

    private static String digitSignature(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }

    public static boolean reorderedPowerOf2(int n) {
        Set<String> powerPatterns = new HashSet<>();
        for (int i = 0; i < 31; i++) {
            int pow = 1 << i;
            powerPatterns.add(digitSignature(pow));
        }
        return powerPatterns.contains(digitSignature(n));
    }

}
