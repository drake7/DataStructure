package recursion;

import java.util.ArrayList;
import java.util.List;

public class MazePathsAdvance {
    // Helper function to check if a move is valid
    private static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1 && !visited[x][y];
    }

    // Recursive function to find all paths
    private static void findPaths(int[][] maze, int x, int y, String path, boolean[][] visited, List<String> result) {
        // Base case: Reach the bottom-right corner
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            result.add(path);
            return;
        }

        // Mark the current cell as visited
        visited[x][y] = true;

        // Move Down
        if (isSafe(maze, x + 1, y, visited)) {
            findPaths(maze, x + 1, y, path + "D", visited, result);
        }

        // Move Right
        if (isSafe(maze, x, y + 1, visited)) {
            findPaths(maze, x, y + 1, path + "R", visited, result);
        }

        // Move Up
        if (isSafe(maze, x - 1, y, visited)) {
            findPaths(maze, x - 1, y, path + "U", visited, result);
        }

        // Move Left
        if (isSafe(maze, x, y - 1, visited)) {
            findPaths(maze, x, y - 1, path + "L", visited, result);
        }

        // Backtrack: Unmark the current cell
        visited[x][y] = false;
    }

    // Main function to find all paths
    public static List<String> getAllPaths(int[][] maze) {
        List<String> result = new ArrayList<>();
        if (maze == null || maze.length == 0 || maze[0][0] == 0 || maze[maze.length - 1][maze[0].length - 1] == 0) {
            return result;
        }

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        findPaths(maze, 0, 0, "", visited, result);

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 1}
        };

        List<String> paths = getAllPaths(maze);
        System.out.println("All Paths from Top-Left to Bottom-Right:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
