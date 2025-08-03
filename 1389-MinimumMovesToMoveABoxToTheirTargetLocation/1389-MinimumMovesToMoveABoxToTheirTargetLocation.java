// Last updated: 8/3/2025, 9:53:46 AM
import java.util.*;

public class Solution {

    public int minPushBox(char[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[] box = new int[2];
        int[] target = new int[2];
        int[] player = new int[2];

        // Find positions of player, box, and target
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (grid[i][j] == 'B')
                    box = new int[]{i, j};
                else if (grid[i][j] == 'T')
                    target = new int[]{i, j};
                else if (grid[i][j] == 'S')
                    player = new int[]{i, j};

        // Directions: up, down, left, right
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        // visited[boxX][boxY][dir] where dir is the direction of push
        Set<String> visited = new HashSet<>();
        Queue<State> q = new LinkedList<>();

        q.offer(new State(box[0], box[1], player[0], player[1], 0));
        visited.add(encode(box[0], box[1], player[0], player[1]));

        while (!q.isEmpty()) {
            State curr = q.poll();

            if (curr.boxX == target[0] && curr.boxY == target[1])
                return curr.pushes;

            for (int[] dir : dirs) {
                int newBoxX = curr.boxX + dir[0];
                int newBoxY = curr.boxY + dir[1];

                int playerReqX = curr.boxX - dir[0];
                int playerReqY = curr.boxY - dir[1];

                if (!inBounds(newBoxX, newBoxY, grid) || grid[newBoxX][newBoxY] == '#')
                    continue;

                if (!inBounds(playerReqX, playerReqY, grid) || grid[playerReqX][playerReqY] == '#')
                    continue;

                if (!canReach(curr.playerX, curr.playerY, playerReqX, playerReqY, curr.boxX, curr.boxY, grid))
                    continue;

                String key = encode(newBoxX, newBoxY, curr.boxX, curr.boxY);
                if (visited.contains(key))
                    continue;

                visited.add(key);
                q.offer(new State(newBoxX, newBoxY, curr.boxX, curr.boxY, curr.pushes + 1));
            }
        }

        return -1;
    }

    private boolean inBounds(int x, int y, char[][] grid) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length;
    }

    private boolean canReach(int startX, int startY, int targetX, int targetY, int boxX, int boxY, char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            if (pos[0] == targetX && pos[1] == targetY)
                return true;

            for (int[] dir : dirs) {
                int nx = pos[0] + dir[0];
                int ny = pos[1] + dir[1];

                if (!inBounds(nx, ny, grid) || visited[nx][ny] || grid[nx][ny] == '#')
                    continue;
                if (nx == boxX && ny == boxY) continue; // can't walk through box

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
        return false;
    }

    private String encode(int bx, int by, int px, int py) {
        return bx + "," + by + "," + px + "," + py;
    }

    class State {
        int boxX, boxY;
        int playerX, playerY;
        int pushes;

        State(int bx, int by, int px, int py, int p) {
            this.boxX = bx;
            this.boxY = by;
            this.playerX = px;
            this.playerY = py;
            this.pushes = p;
        }
    }
}
