public class Test463_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int r = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int x = 0;
                if (grid[i][j] == 1) {
                    x = 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        x--;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        x--;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        x--;
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 1){
                        x--;
                    }
                }
                r += x;
            }
        }
        return r;
    }
}
