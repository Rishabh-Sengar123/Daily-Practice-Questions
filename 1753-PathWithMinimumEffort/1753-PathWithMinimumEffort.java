// Last updated: 2/10/2026, 3:20:30 PM
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        
        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // Min-heap: [effort, row, col]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Track minimum effort to reach each cell
        int[][] efforts = new int[rows][cols];
        for (int[] row : efforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Start from (0, 0) with effort 0
        pq.offer(new int[]{0, 0, 0});
        efforts[0][0] = 0;
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentEffort = current[0];
            int row = current[1];
            int col = current[2];
            
            // If we reached the destination
            if (row == rows - 1 && col == cols - 1) {
                return currentEffort;
            }
            
            // Skip if we've already found a better path to this cell
            if (currentEffort > efforts[row][col]) {
                continue;
            }
            
            // Explore all 4 neighbors
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                // Check bounds
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    // Calculate effort to reach neighbor
                    int newEffort = Math.max(
                        currentEffort,
                        Math.abs(heights[row][col] - heights[newRow][newCol])
                    );
                    
                    // If this path is better, update and add to queue
                    if (newEffort < efforts[newRow][newCol]) {
                        efforts[newRow][newCol] = newEffort;
                        pq.offer(new int[]{newEffort, newRow, newCol});
                    }
                }
            }
        }
        
        return 0; // Should never reach here
    }
}

