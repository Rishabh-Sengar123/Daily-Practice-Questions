// Last updated: 8/8/2025, 3:35:33 PM
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<String, Double> memo = new HashMap<>();

    public double soupServings(int n) {
        // Optimization: for large n, the probability approaches 1
        if (n >= 4800) return 1.0;

        int scaledN = (int) Math.ceil(n / 25.0);
        return dp(scaledN, scaledN);
    }

    private double dp(int a, int b) {
        String key = a + "," + b;
        if (memo.containsKey(key)) return memo.get(key);

        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;

        double result = 0.25 * (
            dp(a - 4, b) +
            dp(a - 3, b - 1) +
            dp(a - 2, b - 2) +
            dp(a - 1, b - 3)
        );

        memo.put(key, result);
        return result;
    }

}
