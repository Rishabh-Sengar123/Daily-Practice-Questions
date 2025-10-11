// Last updated: 10/11/2025, 10:07:05 PM
class Solution {
    public List<Integer> intersection(int[][] matrix) {
        List<Integer> candidates = new ArrayList<>();
        for (int num : matrix[0]) {
            candidates.add(num);
        }

        // Step 2: Check each candidate in all other rows
        Iterator<Integer> it = candidates.iterator();
        while (it.hasNext()) {
            int num = it.next();
            for (int i = 1; i < matrix.length; i++) {
                boolean found = false;
                for (int val : matrix[i]) {
                    if (val == num) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    it.remove(); // remove if not present in this row
                    break;
                }
            }
        }
        Collections.sort(candidates);
        return candidates;
    }
}