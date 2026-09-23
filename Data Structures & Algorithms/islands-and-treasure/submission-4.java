public class Solution {
    private int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int INF = 2147483647;
    private int ROWS, COLS;

    private int bfs(int[][] grid, int r, int c) {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{r, c, 0}); // store row, col, distance
    boolean[][] visit = new boolean[ROWS][COLS];
    visit[r][c] = true;

    while (!q.isEmpty()) {
        int[] curr = q.poll();
        int row = curr[0], col = curr[1], steps = curr[2];
        
        if (grid[row][col] == 0) return steps;

        for (int[] dir : directions) {
            int nr = row + dir[0], nc = col + dir[1];
            if (nr >= 0 && nr < ROWS && nc >= 0 && nc < COLS &&
                !visit[nr][nc] && grid[nr][nc] != -1) {
                visit[nr][nc] = true;
                q.add(new int[]{nr, nc, steps + 1});
            }
        }
    }
    return INF;
}


    public void islandsAndTreasure(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == INF) {
                    int distance = bfs(grid, r, c); 
                    grid[r][c] = distance;      
                }
            }
        }
    }
}
