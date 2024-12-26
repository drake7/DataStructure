package recursion;

import java.util.*;

public class MazePaths {
    public static void main(String[] args) {
        int[][] maze = {{1, 0}, {1, 1}};
        List<String> result = new ArrayList<>();
        findPaths(maze, 0, 0, "", result);
        System.out.println(result);
    }

    private static void findPaths(int[][] maze, int row, int col, String path, List<String> result) {
        int n = maze.length, m = maze[0].length;

        // If out of bounds or obstacle
        if (row >= n || col >= m || maze[row][col] == 0) {
            return;
        }

        // If at destination
        if (row == n - 1 && col == m - 1) {
            result.add(path);
            return;
        }

        // Move down
        findPaths(maze, row + 1, col, path + " Down", result);

        // Move right
        findPaths(maze, row, col + 1, path + " Right", result);
    }
}
