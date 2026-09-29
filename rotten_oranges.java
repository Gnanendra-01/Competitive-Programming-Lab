import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        sb.append(minTimeToRot(grid, n, m)).append("\n");
        System.out.print(sb);
    }
    static int minTimeToRot(int[][] grid, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        if (freshCount == 0) return 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int time = 0;
        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            boolean rottedThisRound = false;
            for (int k = 0; k < size; k++) {
                int[] cell = queue.poll();
                int x = cell[0], y = cell[1];
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        freshCount--;
                        queue.offer(new int[]{nx, ny});
                        rottedThisRound = true;
                    }
                }
            }
            if (rottedThisRound) time++;
        }
        return (freshCount == 0) ? time : -1;
    }
}
